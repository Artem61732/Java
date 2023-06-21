public class MainSetData {
    public static void main(String[] args) {

        SetData set1 = new SetData();
        SetData set2 = new SetData();

        set1.add(4);
        set1.add(6);
        set1.add(8);

        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        System.out.println("Множество 1:");
        set1.display();

        System.out.println("Множество 2:");
        set2.display();

        SetData intersection = set1.intersection(set2);

        System.out.println("Пересечение Множеств:");
        intersection.display();
    }
}
