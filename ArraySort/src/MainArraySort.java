import java.util.Arrays;

public class MainArraySort {
  
  public static void main(String[] args) {
    int[] array = {5, 2, 9, 1, 3};
    
    System.out.println("Исходный массив: " + Arrays.toString(array));
    
    ArraySort arraySort = new ArraySort();
    
    // Сортировка вставками
    int[] insertionSortedArray = arraySort.insertionSort(array.clone());
    System.out.println("Вставка отсортированного массива: " + Arrays.toString(insertionSortedArray));
    
    // Сортировка с использованием быстрой сортировки
    int[] quickSortedArray = arraySort.quickSort(array.clone());
    System.out.println("Массив быстрой сортировки: " + Arrays.toString(quickSortedArray));
    
    // Измеряем время выполнения для маленьких и больших массивов
    measureExecutionTime(arraySort, array);
    measureExecutionTime(arraySort, generateLargeArray());
  }
  
  private static void measureExecutionTime(ArraySort arraySort, int[] array) {
    long startTime = System.nanoTime();
    
    // Выберите либо сортировку вставками, либо быструю сортировку для измерения
    long endTime = System.nanoTime();
    long executionTime = endTime - startTime;
    
    System.out.println("Время выполнения для размера массива " + array.length + ": " + executionTime + " наносекунды");
  }
  
  private static int[] generateLargeArray() {
    int size = 10000;
    int[] array = new int[size];
    
    for (int i = 0; i < size; ++i) {
      array[i] = (int) (Math.random() * size);
    }
    
    return array;
  }
}
