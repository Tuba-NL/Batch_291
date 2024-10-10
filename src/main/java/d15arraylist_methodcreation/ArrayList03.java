package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
//Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
// Example 1: Create an Integer List.Write the two closest integers in this List.
//      [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        System.out.println("nums = " + nums);//nums = [12, 23, 10, 19]

        //Collections.sort(nums); //sort() yapmak icin 1.yol:Collections yardimci class'i kullandik
        nums.sort(null);//sort() yapmak icin 2.yol: ArrayList icindekini kullanmak

        System.out.println(nums); //[10, 12, 19, 23]

        //---------------------------------------
        int minDiff = nums.get(1) - nums.get(0);//12-10 = 2 min fark olarak kabul ettik

        for (int i = 1; i < nums.size(); i++) {//1.index'ten basllattik ki , 1.den 0.yi cikaralim
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1));
            }
          //  System.out.println("minDiff = " + minDiff);//minDiff = 2
/*
        //-------------------------

        //En kucuk farki hangi iki sayidan elde ettigimizi bulalim
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1)); //12 ve 10
            }
        }*/
       /*     //ODEV: Bu soru tek for’la veya for each’le cozulebilir miydi?

            // Listeyi sıralıyoruz
            Collections.sort(nums);

            // En küçük farkı ve o farka sahip iki sayıyı bulmak için değişkenler
            int minFark = Integer.MAX_VALUE; // Başlangıçta en büyük değeri veriyoruz
            int sayi1 = 0;
            int sayi2 = 0;

            // Ardışık elemanlar arasındaki farkı kontrol ediyoruz
            for (int i = 0; i < nums.size() - 1; i++) {
                int fark = nums.get(i + 1) - nums.get(i);
                if (fark < minFark) {
                    minFark = fark;
                    sayi1 = nums.get(i);
                    sayi2 = nums.get(i + 1);
                }
            }

            // Sonuçları yazdırıyoruz
            System.out.println("Birbirine en yakın sayılar: " + sayi1 + " ve " + sayi2);
        }*/
        }

    }
}