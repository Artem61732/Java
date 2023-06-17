public class ArraySort {

  //Сортируем заданный массив с помощью алгоритма сортировки вставками.
  public int[] insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; ++i) {
      int key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
    return array;
  }
  
  // Сортирует заданный массив с помощью алгоритма быстрой сортировки.
  public int[] quickSort(int[] array) {
    quickSortRecursive(array, 0, array.length - 1);
    return array;
  }
  
  private void quickSortRecursive(int[] array, int low, int high) {
    if (low < high) { // Базовый случай: более одного элемента
      int pivotIndex = partition(array, low, high);
      quickSortRecursive(array, low, pivotIndex - 1);
      quickSortRecursive(array, pivotIndex + 1, high);
    }
  }
  
  // Выбираем крайний правый элемент в качестве опорного
  private int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;

    for (int j = low; j < high; ++j) { // Итерация по подмассиву
      if (array[j] <= pivot) { // Если текущий элемент меньше или равен опорному элементу
        i++;
        swap(array, i, j); // Поменять местами массив [i] и массив [j]
      }
    }
    swap(array, i + 1, high);
    return i + 1;
  }
  
  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
