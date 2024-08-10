import java.util.ArrayList;
import java.util.Arrays;

public class PrintSequenceArrayProblem {
  public static void Sequence(int arr[], int index, ArrayList<Integer> tempArray) {

    if (index == arr.length) {

      if (tempArray.size() > 0) {
        System.out.println(tempArray + " ");

      }
      return;
    }

    Sequence(arr, index + 1, tempArray);
    tempArray.add(arr[index]);
    Sequence(arr, index + 1, tempArray);
    tempArray.remove(tempArray.size() - 1);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2,3};
  System.out.println(Arrays.toString(arr));
    Sequence(arr, 0, new ArrayList<>());

  }
}
