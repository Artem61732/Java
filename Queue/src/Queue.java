public class Queue {
    private int maxSize; // максимальное количество элементов в очереди
    private int[] queueArray; // массив для хранения элементов
    private int front; // начало очереди
    private int rear; // конец очереди
    private int currentSize; // текущее количество элементов в очереди

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Очередь заполнена. Не удается поставить элемент в очередь: " + item);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Поставленный в очередь элемент: " + item);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Очередь пуста. Не удается удалить элемент из очереди.");
            return -1;
        } else {
            int dequeuedItem = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            System.out.println("Исключенный из очереди элемент: " + dequeuedItem);
            return dequeuedItem;
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }
}

