import java.util.Arrays;
public class LABA_3 {
    public static void main(String[] args) {
        int[] numbers = {3, 0, 2, 0, 5, 0, 1, 0, 4, 0, 7, 0, 9, 0, 0, 6, 8, 0, 0, 0};
        int[] sortedNumbers = removeZerosAndSort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static int[] removeZerosAndSort(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num != 0) {
                count++;
            }
        }

        int[] nonZeroNumbers = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                nonZeroNumbers[index++] = num;
            }
        }

        mergeSort(nonZeroNumbers, 0, nonZeroNumbers.length - 1);

        return nonZeroNumbers;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}



