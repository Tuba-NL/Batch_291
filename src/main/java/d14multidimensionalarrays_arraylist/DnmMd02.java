package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class DnmMd02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.

        int[][] numbers = {{5, 4}, {2, 3, 2}};// ==> { 5,4,2,3,2 }
        System.out.println(Arrays.deepToString(numbers));//[[5, 4], [2, 3, 2]]
        //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim
        int sum = 0;
        for (int[] w : numbers) {
            sum = sum + w.length;
        }
        System.out.println("sum: " + sum);//5

        //2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim
        int[] newNumbers = new int[sum];
        System.out.println(Arrays.toString(newNumbers));//[0, 0, 0, 0, 0]

        //3.adim: Iki boyutlu Array’deki elemanlari tek boyutlu Array’e transfer edelim
        int idx = 0;
        for (int[] w : numbers) {
            for (int k : w) {
                newNumbers[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newNumbers));//[5, 4, 2, 3, 2]

        System.out.println("---------------------------------------");

        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
        String[][] cities = {{"van", "mus", "izmir"}, {"erzincan"}, {"istanbul", "ankara"}};
        System.out.println(Arrays.deepToString(cities));//[[van, mus, izmir], [erzincan], [istanbul, ankara]]

        //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim
        int toplamEleman = 0;
        for (String[] w : cities) {
            toplamEleman += w.length;
        }
        System.out.println("toplamEleman = " + toplamEleman);//6

        //2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim
        String[] newCities = new String[toplamEleman];
        System.out.println(Arrays.toString(newCities));//[null, null, null, null, null, null]

        //3.adim: Iki boyutlu Array’deki elemanlari tek boyutlu Array’e transfer edelim
        int index = 0;       //[[van, mus, izmir], [erzincan], [istanbul, ankara]]
        for (String[] w : cities) {
            for (String k : w) {
                newCities[index]=k;
                index++;
            }
        }
        System.out.println(Arrays.toString(newCities));//[van, mus, izmir, erzincan, istanbul, ankara]
    }
}
