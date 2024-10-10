package d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

              X X X X X
              X X X X X
              X X X X X    */
        //  int row = 3;
        //  int column = 5;//bu degerleri daha sonra kullanicadan isteyerek gelistirdik.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini yaziniz");
        int row = scanner.nextInt();
        System.out.println("Sutun sayisini yaziniz");
        int column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("X ");
            }
            System.out.println();//print yanyana yazar, pointer`i bir alta aldik


            // }
              /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.
            *
            * *
            * * *
            * * * *

        */

       //   for (int k = 1; k <= row; k++) {

       //       for (int t = 1; t <= k; t++) {
       //           System.out.print("* ");
       //       }
       //       System.out.println();
       //   }

        }

    }
}

