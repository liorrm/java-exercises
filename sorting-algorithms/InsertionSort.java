import java.util.*;

public class InsertionSort {

  public static int[] InsertionSort(int[] numbers) {

    for (int i=1; i<numbers.length; i++) {

      int currentValue = numbers[i]; // 2
      int currentIndex = i; // 1

      while (currentIndex > 0 && numbers[currentIndex - 1] > currentValue) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[currentIndex -1];
        currentIndex -= 1;
      }
      numbers[currentIndex] = currentValue;
    }
    System.out.println(Arrays.toString(numbers));
    return numbers;
  }

  public static void main(String[] args) {

    int[] integerArray = new int[10];

    for (int i=0; i<integerArray.length; i++) {
          integerArray[i] = (int) (Math.random() * 126) + 1;
    }

    InsertionSort(integerArray);

  }

}