public class MainBiraryTree {
    public static void main(String[] args) {
        // Создаем бинарное дерево
        BinaryTree binaryTree = new BinaryTree();

        // Вставляем звенья в бинарное дерево
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);

        // Выполняем неупорядоченный обход бинарного дерева
        System.out.println("Неупорядоченный обход бинарного дерева:");
        binaryTree.inorderTraversal();
    }
}