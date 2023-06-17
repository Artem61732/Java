public class MainStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // переполнение стека

        System.out.println("Убранное значение: " + stack.pop()); // 50, popped
        System.out.println("Верхнее значение: " + stack.peek()); // 40, top
        System.out.println("Размер стека: " + stack.size()); // 4, stack size

        while (!stack.isEmpty()) {
            System.out.println("Убранное значение: " + stack.pop());
        }

        System.out.println("Размер стека: " + stack.size()); // 0
        System.out.println("Стек пуст? " + stack.isEmpty()); // true

        System.out.println("Убранное значение: " + stack.pop()); // переполнение стека
    }
}