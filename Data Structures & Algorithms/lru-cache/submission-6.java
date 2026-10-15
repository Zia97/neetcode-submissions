class Node {
    int key;
    int val;
    Node next;
    Node prev;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    HashMap<Integer, Node> keyNodeMap = new HashMap<>();
    final int capacity;
    Node left = new Node(0, 0);
    Node right = new Node(0, 0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        left.prev = null;
        left.next = right;
        right.prev = left;
        right.next = null;
    }

    public int get(int key) {
        if (keyNodeMap.containsKey(key)) {
            Node foundNode = keyNodeMap.get(key);
            remove(foundNode);
            insert(foundNode);
            return foundNode.val;

        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);

        if (keyNodeMap.containsKey(key)) {
            Node oldNode = keyNodeMap.get(key); 
            remove(oldNode);
            keyNodeMap.remove(key);
        } else {
            if (keyNodeMap.size() == capacity) {
                remove(left.next);
            }
        }
        insert(newNode);
    }

    public void insert(Node node) {
        Node prev = right.prev;
        prev.next = node;
        right.prev = node;
        node.prev = prev;
        node.next = right;

        keyNodeMap.put(node.key, node);
    }

    public void remove(Node node) {
        Node prev = node.prev;
        prev.next = node.next;
        node.next.prev = prev;
        keyNodeMap.remove(node.key);
    }
}
