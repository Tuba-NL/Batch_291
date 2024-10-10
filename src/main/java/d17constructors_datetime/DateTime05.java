package d17constructors_datetime;

import java.time.*;

public class DateTime05 {
    public static void main(String[] args) {

        //ornek 1: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 1: Write the code that calculates the difference between two given dates.

        //Java'da Period class’i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date1 = LocalDate.of(1984, 8, 8);
        LocalDate date2 = LocalDate.of(1978, 9, 9);

        Period difference = Period.between(date2, date1);
        System.out.println(difference); //P5Y10M30D 5yil, 10ay, 30gun

        //Ayri ayri gormek istersek;

        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasindaki fark: "); //1984-08-08 ve 1978-09-09 arasindaki fark:
        System.out.println("Yil : " + yearDifference);
        System.out.println("Ay: " + monthDifference);
        System.out.println("Gun: " + dayDifference);

        //Instant
        //ZonedDateTime
        //Duration
        //Clock
        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html

    }
}