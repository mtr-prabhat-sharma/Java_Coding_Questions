import java.util.ArrayList;

public class Merging_two_sorted_Arrays {
    public static void main(String[] args) {
        int[] a1 = {3,5,7,8,9};
        int [] a2 = {1,2,4,6};
        int i =0;
        int j = 0;

        ArrayList<Integer> number = new ArrayList<>();

        while(i < a1.length && j < a2.length){
            if(a1[i] > a2[j]){
                number.add(a2[j]);
                j++;
            }else {
                number.add(a1[i]);
                i++;
            }
        }

        while(i<a1.length) {
            number.add(a1[i]);
            i++;
        }

        while(j < a2.length) {
            number.add(a2[j]);
        }

        System.out.println("After Merging");
        for(int k: number) {
            System.out.print(k+" ");
        }
    }
}
