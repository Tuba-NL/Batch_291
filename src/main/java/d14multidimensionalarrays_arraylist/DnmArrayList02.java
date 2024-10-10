package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;

public class DnmArrayList02 {
    public static void main(String[] args) {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin.
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(10);
        sayilar.add(22);
        sayilar.add(35);
        sayilar.add(44);
       System.out.println("sayilar = " + sayilar);//[3, 10, 22, 35, 44]
        for (int w : sayilar) {
            if (w % 2 !=0){
                sayilar.set(sayilar.indexOf(w), 11);
            }
        }
        System.out.println("sayilar = " + sayilar);//[11, 10, 22, 11, 44]

        //Ornek 1: Bir Integer ArrayList oluşturun ve cift olanları 9 olarak değiştirin.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4);
        list.add(61);
        list.add(34);
        list.add(99);
        System.out.println("list = " + list);//[0, 4, 61, 34, 99]
        for (Integer w : list) {
            if (w%2==0){
                list.set(list.indexOf(w),9);
            }
        }
        System.out.println("list = " + list);//[9, 9, 61, 9, 99]
    }
}
