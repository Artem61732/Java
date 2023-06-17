// Класс звена, представляющий звено в бинарном дереве
class Node {
    int data;
    Node left;
    Node right;

    // Конструктор для инициализации звена заданными данными
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// класс BinaryTree, представляющий бинарное дерево
public class BinaryTree {
    Node root;

    // Конструктор для инициализации пустого бинарного дерева
    public BinaryTree() {
        root = null;
    }

    // Метод для вставки звена в бинарное дерево
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Рекурсивный метод для вставки звена в бинарное дерево
    private Node insertRec(Node root, int data) {
        // Если дерево пусто, создаем новое звено и возвращаем его
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // В противном случае возвращаемся вниз по дереву
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // Возвращаем (неизменный) указатель звена
        return root;
    }

    // Метод для выполнения неупорядоченного обхода бинарного дерева
    public void inorderTraversal() {
        inorderTraversalRec(root);
    }

    // Рекурсивный метод для обхода по порядку
    private void inorderTraversalRec(Node root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRec(root.right);
        }
    }
}