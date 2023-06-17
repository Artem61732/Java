public class List {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements; // Массив для хранения элементов
    private int size; // Текущий размер списка

    public List() {
        elements = new Object[DEFAULT_CAPACITY]; // Инициализируем массив емкостью по умолчанию
        size = 0;
    }

    public void add(String item) {
        if (size == elements.length) {
            resizeArray();
        }
        elements[size] = item; // Добавляем элемент в следующую доступную позицию в массиве
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (String) elements[index]; // Получить элемент по указанному индексу
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        int newSize = elements.length * 2;
        Object[] newArray = new Object[newSize];
        System.arraycopy(elements, 0, newArray, 0, size); // Копируем элементы из старого массива в новый массив
        elements = newArray; // Обновляем ссылку на новый массив
    }
}
