import java.util.Arrays;

public class Sorting_Array_Elements_Using_InbuiltMethod {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6,4};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
