public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Максимальный размер очереди: " + queue.getMaxSize());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // Очередь переполнена, невозможно добавить элемент 60

        System.out.println("Удаление элементов из очереди:");
        while (!queue.isEmpty()) {
            int item = queue.dequeue();
            System.out.println("Исключенный из очереди элемент: " + item);
        }

        queue.dequeue(); // Очередь пуста. Не удается удалить элемент из очереди.
    }
}

