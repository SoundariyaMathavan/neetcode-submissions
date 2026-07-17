

class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // Dummy nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Remove a node from the linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert a node before tail (MRU position)
    private void insert(Node node) {
        Node prev = tail.prev;

        prev.next = node;
        node.prev = prev;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {

        // Key not found
        if (!map.containsKey(key))
            return -1;

        // Get the node
        Node node = map.get(key);

        // Since it is accessed, move it to MRU position
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        // If key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);

            // Update value
            node.value = value;

            // Move to MRU position
            remove(node);
            insert(node);

            return;
        }

        // Create new node
        Node node = new Node(key, value);

        // Add to linked list
        insert(node);

        // Add to HashMap
        map.put(key, node);

        // Remove LRU if capacity exceeded
        if (map.size() > capacity) {

            Node lru = head.next;

            remove(lru);

            map.remove(lru.key);
        }
    }
}