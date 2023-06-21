import java.util.HashSet;
import java.util.Set;

public class SetData {
    private Set<Integer> set;

    public SetData() {
        set = new HashSet<>();
    }

    // Добавление четного положительного целого числа в множество
    public void add(int element) {
        if (element > 0 && element % 2 == 0) {
            set.add(element);
        }
    }

    // Проверка на существование элемента в множестве
    public boolean contains(int element) {
        return set.contains(element);
    }

    // Пересечение между двумя множествами
    public SetData intersection(SetData otherSet) {
        SetData intersectionSet = new SetData();

        for (int element : set) {
            if (otherSet.contains(element)) {
                intersectionSet.add(element);
            }
        }

        return intersectionSet;
    }

    // Отображение множества
    public void display() {
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
