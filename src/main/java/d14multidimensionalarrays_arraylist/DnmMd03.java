package d14multidimensionalarrays_arraylist;

public class DnmMd03 {
    public static void main(String[] args) {
   //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int[][] ages = {{15, 4}, {12, 43, 21}};
        int min = ages[0][1];
        int max= ages[0][1];

        for (int[] w:ages) {
            for (int k:w) {
                min = Math.min(min,k);
                max = Math.max(max,k);
            }
        }
        System.out.println("min = " + min);//4
        System.out.println("max = " + max);//43
        System.out.println(min+max);//47
    }
}
