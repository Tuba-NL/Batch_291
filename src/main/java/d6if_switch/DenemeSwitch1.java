package d6if_switch;

public class DenemeSwitch1 {
    public static void main(String[] args) {
        //"switch" Statement

        //switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
        //if -else if'in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
        //genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)

        /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        Sunday==>1  . . .  Saturday==>7

        1.Yol : if - else if*/

        /*Example 1: Write the code that prints the number of the day given the day name.
        Sunday==>1 . . .  Saturday==>7

        Path 1 : if - else if*/

        String dayName = "pazar";

        if (dayName.equalsIgnoreCase("Pazar")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Pazartesi")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Sali")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Carsamba")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Persembe")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Cuma")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Cumartesi")) {
            System.out.println(7);
        }else
            System.out.println("gecerli birsey giriniz");


        switch (dayName.toLowerCase()) {
            case "pazar":
                System.out.println(1);
                break;
            case "pazartesi":
                System.out.println(2);
                break;
            case "sali":
                System.out.println(3);
                break;
            case "carsamba":
                System.out.println(4);
                break;
            case "persembe":
                System.out.println(5);
                break;
            case "cuma":
                System.out.println(6);
                break;
            case "cumartesi":
                System.out.println(7);
                break;
            default:
                System.out.println("gecerli gun giriniz");

        }
    }
}
