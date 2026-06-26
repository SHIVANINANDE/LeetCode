import java.util.HashMap;

class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int size;
    HashMap<Integer, Node> mpp;
    Node head, tail;

    public LRUCache(int capacity) {
        size = capacity;
        mpp = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (!mpp.containsKey(key))
            return -1;

        Node node = mpp.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (mpp.containsKey(key)) {

            Node node = mpp.get(key);
            node.value = value;

            remove(node);
            insert(node);

            return;
        }

        if (mpp.size() == size) {

            Node lru = tail.prev;

            remove(lru);
            mpp.remove(lru.key);
        }

        Node node = new Node(key, value);

        insert(node);
        mpp.put(key, node);
    }

    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
}