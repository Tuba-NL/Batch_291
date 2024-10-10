package d7ternary_string;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
    //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
    //Example : Write the code to check if the given number has 3 digits

        int a = -123;
        a = Math.abs(a);// bu method sayesinde - sayilari da 3 basamakli kabul etti, cunku mutlak haline cevirdik
        String result = (a>99 && a<1000) ? "Uc basamaklidir" : "Uc basmakli degildir";
        System.out.println("result = " + result);//Uc basamaklidir

        //Kendim denedim
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        Scanner input  = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        sayi = Math.abs(sayi);
        String sonuc = sayi>99 && sayi<1000 ? "uc basamaklidir" : "uc basamakli degildir";
        System.out.println("sonuc = " + sonuc);
    }
}
