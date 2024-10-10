package d6if_switch;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
  /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
  Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

/*Example 1: Write the code that decides whether it is Weekend or Weekday based on the day names given by the user.
Monday ==> Weekday Saturday ==> Weekend*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String dayName = scanner.next();
        boolean isWeekDay = dayName.equalsIgnoreCase("Pazartesi")
                || dayName.equalsIgnoreCase("Sali")
                || dayName.equalsIgnoreCase("Carsamaba")
                || dayName.equalsIgnoreCase("Persembe")
                || dayName.equalsIgnoreCase("Cuma");
        boolean isWeekendDay = dayName.equalsIgnoreCase("Cumartesi")
                || dayName.equalsIgnoreCase("Pazar");

        if (isWeekendDay){
            System.out.println("Hafta sonu");
        } else if (isWeekDay) {
            System.out.println("Hafta ici");
        }else
            System.out.println("Lutfen dogru gun giriniz");

    }
}
