import java.util.*;

public class BubbleSort {

  public static int[] bubbleSort(int[] args) {
    boolean changed = false;
    do {
        changed = false;
        for (int i = 0; i<args.length - 1; i++) {
            if (args[i] > args[i + 1]) {
              int temp = args[i];
              args[i] = args[i + 1];
              args[i + 1] = temp;
              changed = true;
            }
        }
    } while (changed);

    System.out.println(Arrays.toString(args));
    return args;
  }

  public static void main(String[] args) {

    int[] integerArray = new int[10];

    for (int i = 0; i<integerArray.length; i++) {
          integerArray[i] = (int) (Math.random() * 126) + 1;

          System.out.println(integerArray[i]);

    }

    System.out.println("calling bubbleSort method below this");

    bubbleSort(integerArray);


  }

}