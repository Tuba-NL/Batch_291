package d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

     //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
    //Example 1: Convert the word “money” in String “s” to “dollar”.

     //replace(a,b) methodu, 2.parametredekini 1.nin yerine koyar.
     // Kucuk buyuk harfe duyarlidir

        String s = "Learn Java earn money";

        // s = s.replace("money","dollar");
        String s1 = s.replace("money", "dollar");
        System.out.println("s1 = " + s1);

    //Ornek 2: “s” String’indeki tum “e” harflerini siliniz.
    //Example 2: Delete all “e” letters in the string “s”.

        String s2 = s.replace("e", "");//""hiclik
        System.out.println("s2 = " + s2);
    }
}
