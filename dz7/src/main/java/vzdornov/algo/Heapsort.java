package vzdornov.algo;

public class Heapsort implements ISort {

  @Override
  public void sort(int[] arr) {
    heapSort(arr);
  }

  public static  void heapSort(int[] arr) {
    buildMaxHeap(arr);
    int heapSize = arr.length - 1;
    for (int i = arr.length - 1; i > 0; i--) {
      swap(arr, 0, heapSize);
      heapSize--;
      maxHeapify(arr, 0, heapSize);
    }
  }

  public static void maxHeapify(int[] arr, int i, int n) {
    int leftChild = i * 2 + 1;
    int rightChild = leftChild + 1;
    int largest = i;
    if (leftChild <= n && arr[i] < arr[leftChild]) {
      largest = leftChild;
    }
    if (rightChild <= n && arr[largest] < arr[rightChild]) {
      largest = rightChild;
    }
    if (largest != i) {
      swap(arr, i, largest);
      maxHeapify(arr, largest, n);
    }
  }

  public static void buildMaxHeap(int[] arr) {
    for (int i = arr.length / 2; i > -1; i--) {
      maxHeapify(arr, i, arr.length - 1);
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
