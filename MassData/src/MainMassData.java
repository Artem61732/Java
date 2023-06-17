public class MainMassData {
    public static void main(String[] args) {
        // Создаем экземпляр Множества
        MassData<String> massData = new MassData<>();

        // Добавляем элементы в Множество
        massData.add("Яблоко");
        massData.add("Банан");
        massData.add("Апельсин");

        System.out.println("Размер Множества: " + massData.size());

        // Проверьте, содержит ли Множество «Банан»
        System.out.println("Множество содержит «Банан»: " + massData.contains("Банан"));

        massData.remove("Банан");

        // Отображение обновленного размера Множества
        System.out.println("Размер Множества после удаления: " + massData.size());

        // Показать все элементы Множества
        massData.displayData();

        // Очистить Множество
        massData.clear();

        System.out.println("Окончательный размер Множества: " + massData.size());
    }
}