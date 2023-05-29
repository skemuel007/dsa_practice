package BinarySearchTrees;

class Node {
    public int element;
    public Node left;
    public Node right;

    public Node(int e, Node l, Node r) {
        element = e;
        left = l;
        right = r;
    }
}
public class BinarySearchTreeImpl {

    Node root;
    public BinarySearchTreeImpl() {
        root = null;
    }

    public void insert(Node tempRoot, int e) {
        Node temp = null;
        while(tempRoot != null ) {
            temp = tempRoot;

            if (e == tempRoot.element) {
                return ;
            } else if (e < tempRoot.element) {
                tempRoot = tempRoot.left;
            } else if (e > tempRoot.element) {
                tempRoot = tempRoot.right;
            }
        }

        Node n = new Node(e, null, null);
        if (root != null ) {
            if (e < temp.element) {
                temp.left = n;
            } else {
                temp.right = n;
            }
        } else {
            root = n;
        }
    }

    public Node insertRecursively(Node tempRoot, int e) {
        if (tempRoot != null) {
            if (e < tempRoot.element)
                tempRoot.left = insertRecursively(tempRoot.left, e);
            else if (e > tempRoot.element) {
                tempRoot.right = insertRecursively(tempRoot.right, e);
            }
        } else {
            Node n = new Node (e, null, null);
            tempRoot = n;
        }

        return tempRoot;
    }

    public void inOrder(Node tempRoot) {
        if (tempRoot != null) {
            inOrder(tempRoot.left);
            System.out.print(tempRoot.element + " ");
            inOrder(tempRoot.right);
        }
    }

    public void preOrder(Node tempRoot) {
        if (tempRoot != null) {
            System.out.print(tempRoot.element + " ");
            preOrder(tempRoot.left);
            preOrder(tempRoot.right);
        }
    }

    public void postOrder(Node tempRoot) {
        if (tempRoot != null) {
            postOrder(tempRoot.left);
            postOrder(tempRoot.right);
            System.out.print(tempRoot.element + " ");
        }
    }

    public void levelOrder() {
        // using queues
        QueueLinkedList q = new QueueLinkedList();
        Node t = root;
        System.out.print(t.element + " ");
        q.enqueue(t);

        while(!q.isEmpty()) {
            t = (Node)q.dequeue();
            if (t.left != null) {
                System.out.print(t.left.element + " ");
                q.enqueue(t.left);
            } else {
                System.out.print(t.right.element + " ");
                q.enqueue(t.right);
            }
        }
    }

    public boolean search(int key) {
        Node tempRoot = root;
        while(tempRoot != null) {
            if (key == tempRoot.element)
                return true;
            else if (key < tempRoot.element) {
                tempRoot = tempRoot.left;
            } else if (key > tempRoot.element) {
                tempRoot = tempRoot.right;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        BinarySearchTreeImpl b = new BinarySearchTreeImpl();
        b.root = b.insertRecursively(b.root, 50);
        // b.insert(b.root, 50); use for none recursive
        b.insert(b.root, 30);
        b.insert(b.root, 80);
        b.insert(b.root, 10);
        b.insert(b.root, 40);
        b.insert(b.root, 60);
        b.insert(b.root, 90);
        System.out.println("Inorder traversal");
        b.inOrder(b.root);
        System.out.println();
        System.out.println("Preorder traversal");
        b.preOrder(b.root);
        System.out.println();
        System.out.println("Postorder traversal");
        b.postOrder(b.root);
        System.out.println();
        System.out.println("Search result: 60 " + b.search(60));
        System.out.println("Search result: 30 " + b.search(30));
        System.out.println("Search result: 70 " + b.search(70));
    }
}

class QNode {
    Object element;
   QNode next;

    public QNode(Object e, QNode n) {
        element = e;
        next = n;
    }
}
class QueueLinkedList {

    QNode front;
    QNode rear;
    int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Object e) {
        QNode newest = new QNode(e, null);
        if (isEmpty())
        {
            front = newest;
        } else {
            rear.next = newest;
        }

        rear = newest;
        size++;

    }

    public Object dequeue() {
        if (isEmpty())
            return -1;
        Object element = front.element;
        if (length() == 1)
        {
            front = null;
            rear = null;
        } else if (length() > 1) {
            front = front.next;
        }
        size--;
        return element;
    }

    public Object front() {
        if(isEmpty())
            return -1;
        return front.element;
    }

    public Object rear() {
        if(isEmpty())
            return -1;
        return rear.element;
    }

    public void display() {
        QNode p = front;

        while(p != null)
        {
            System.out.print(p.element + "-->");
            p = p.next;
        }

        System.out.println();
    }
}
