package vzdornov.algo;

public class SelectionSort implements ISort {

  @Override
  public void sort(int[] arr) {
    selectionSort(arr);
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int iMin = i;
      for (int j = i + 1; j < arr.length; j++) {
        iMin = (arr[j]< arr[iMin]) ? j : iMin;
      }
      swap(arr, i, iMin);
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
