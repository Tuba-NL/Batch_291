package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class DnmMd01 {
    public static void main(String[] args) {
        //1.MultiDimensional Array nasil olusturulur?
        int[][] a = new int[3][2];
        String[][] isim = new String[2][1];

        //2.MultiDimensional Array'lere nasil eleman eklenir?
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[2][0] = 5;
        a[2][1] = 6;

        isim[0][0] = "ali";
        isim[1][0] = "veli";

        //3.MultiDimensional Array konsola nasil yazdirilir?
        System.out.println(Arrays.deepToString(a));//[[1, 2], [3, 4], [5, 6]]
        System.out.println(Arrays.deepToString(isim));//[[ali], [veli]]

        //4.MultiDimensional Array’den spesifik bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);//4
        System.out.println(isim[0][0]);//ali

        //5.MultiDimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[1,2]
        System.out.println(Arrays.toString(isim[1]));//veli

        //6.Kisa yoldan MultiDimensional Array nasil olusturulur?
        String[][] names = {{"selami", "zahire"}, {"hamit", "tuba", "kubra"}, {"huseyin", "pinar", "omer"}, {"emin", "hulya"}, {"murat", "meryem"}};
        //Array i yazdirma:
        System.out.println(Arrays.deepToString(names));//[[selami, zahire], [hamit, tuba, kubra], [huseyin, pinar, omer], [emin, hulya], [murat, meryem]]

        //spesifik bir isim alma:
        System.out.println(names[1][1]);//tuba

        //array icindeki array i yazdirma:
        System.out.println(Arrays.toString(names[1]));//[hamit, tuba, kubra]

        //Ornek 1: Yukaridaki names array’inde toplam kac isim oldugunu bulunuz.
        int sum = 0;
        for (String[] w : names) {
            sum += w.length;
        }
        System.out.println("sum : " + sum);//12

        //Ornek 2: Yukaridaki names Array’inde icinde “m” olan isimleri console’a yazdiriniz.
        for (String[] w : names) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.print(k + " ");//selami hamit omer emin murat meryem
                }

            }


        }
    }
}
