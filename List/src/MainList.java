public class MainList {
    public static void main(String[] args) {
        List myList = new List();

        // Добавляем элементы в список
        myList.add("Яблоко");
        myList.add("Банан");
        myList.add("Апельсин");

        // Доступ к элементам из списка
        String firstElement = myList.get(0);
        String secondElement = myList.get(1);
        String thirdElement = myList.get(2);

        // Отображение размера списка и элементов
        System.out.println("Размер списка: " + myList.size());
        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Второй элемент: " + secondElement);
        System.out.println("Третий элемент: " + thirdElement);
    }
}
