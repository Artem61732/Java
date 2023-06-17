import java.util.ArrayList;
import java.util.List;

public class MassData<T> {
    private List<T> data;

    public MassData() {
        data = new ArrayList<>(); // Инициализируем список данных как ArrayList
    }

    public void add(T element) {
        data.add(element);
    }

    public void remove(T element) {
        data.remove(element);
    }

    public void clear() {
        data.clear();
    }

    public int size() {
        return data.size();
    }

    public boolean contains(T element) {
        return data.contains(element); // Проверяем, содержит ли список данных определенный элемент
    }

    public void displayData() {
        System.out.println("Элементы множества:");
        for (T element : data) {
            System.out.println(element);
        }
    }
}