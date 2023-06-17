public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Стек переполнен");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Стек переполнен");
            return -1; // Возвращает значение по умолчанию, указывающее недополнение
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Стек пуст");
            return -1; // Возвращает значение по умолчанию, указывающее на пустой стек
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }
}