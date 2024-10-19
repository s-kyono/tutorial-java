package lessons;

import java.util.Random;

public class RepeatWhile {
    public static void printlnValues() {
        int num1, num2, num3, num4;
        num1 = num2 = 1;
        num4 = 5;
        Random rand = new Random();

        while (num1 < 100){
            System.out.println("num1 = " + num1);
            num1 *= 2;
        }

        while (true){
            System.out.println("num2 = " + num2);
            num2 *= 2;
            if (num2 > 10){
              break;
            }
        }

        System.out.println("6が出たら終わりです");

        do {
            num3 = rand.nextInt(6) + 1;
            System.out.println("no = " + num3);
        } while (num3 != 6);

        do {
            System.out.println("num4 = " + num4);
            num4 -= 2;

            if (num4 < 0){
              break;
            }
          } while (true);

    }
}
