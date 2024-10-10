package d10loops;

public class Deneme {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz. (interview sorusu)
        //example 1: Print the sum of the digits of a given integer to the console

        //           578 ==> 5+7+8=20 ==> Output 20 olmali
        int sum = 0;
        for (int i = 578; i > 0 ; i/=10) {
            sum = sum + i % 10;

        }
        System.out.println(sum);
    }
}
