package d6if_switch;

import java.util.Scanner;

public class DenemeSwitch3 {
    public static void main(String[] args) {
        /*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.

Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir
 ve bu değer doğrudan bir değişkene atanabilir.

Yeni switch ifadesinin ana özellikleri:

Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/

 /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

/*Example 1: Ask the user to enter a month number (between 1 and 12).
        Write a program that determines the season according to the entered month number and prints the result to the console.

 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1 ila 12 arasinda bir ay numarasi giriniz");
        int ayNumarasi = scanner.nextInt();

        String mevsim = switch (ayNumarasi) {
            case 12, 1, 2 -> "Kis";
            case 3, 4, 5 -> "Ilkbahar";
            case 6, 7, 8 -> "Yaz";
            case 9, 10, 11 -> "Sonbahar";
            default -> "Bilinmeyen ay";

        };
        System.out.println("Mevsim : " + mevsim);


        //ornek: Bir kişinin haftanın gününe göre hangi meyveleri bulabileceğini belirlemek istiyoruz. Her gün için bir meyve önerisi yapacağız.

        System.out.println("Haftanin gununu girin(1-7)");
        int gun = scanner.nextInt();

        String fruit = switch (gun){
            case 1 -> "Pazartesi : Elma";
            case 2 -> "Sali : Armut";
            case 3 -> "Carsamba : Karpuz";
            case 4 -> "Persembe : Uzum";
            case 5 -> "Cuma : Kiraz";
            case 6 -> "Cumartesi : Seftali";
            case 7 -> "Pazar : Muz";
            default -> "Gecerli gun numarasi giriniz";
        };
        System.out.println("fruit = " + fruit);

    }

}