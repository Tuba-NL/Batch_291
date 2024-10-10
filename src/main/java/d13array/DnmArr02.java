package d13array;

import java.util.Arrays;

public class DnmArr02 {
    public static void main(String[] args) {
    //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
    //bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
        //1.yol:
        int[] ages ={15, 40, 46, 60, 89,3};
        System.out.println(Arrays.toString(ages));//[15, 40, 46, 60, 89, 3]
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[3, 15, 40, 46, 60, 89]
        System.out.println(ages[0]+ages[ages.length-1]);//92
        System.out.println("---------------------");

        //2.yol:
        int min = ages[0];
        int max = ages[0];

        for (int  w: ages) {
            min = Math.min(min ,w);
            max = Math.max(max ,w);
        }
        System.out.println(min+max);//92


    }
}
