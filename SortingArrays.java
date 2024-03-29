public class SortingArrays {
    public static void main(String[] args) {
        int[] a1 = {4,2,6,1,5,3};
        System.out.println("Array elements before sorting");
        for (int k : a1) {
            System.out.println(k + " ");
        }

        for(int i =0;i<a1.length;i++) {
            for(int j=i+1;j<a1.length;j++) {
                if(a1[i] > a1[j]) {
                    int temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;

                }
            }
        }
        System.out.println("Array elements AFTER sorting");
        for (int j : a1) {
            System.out.println(j + " ");
        }
    }
}
