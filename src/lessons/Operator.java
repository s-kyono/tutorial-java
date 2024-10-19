package lessons;

public class Operator {
    public static void printlnValues() {
        Integer num1 = 7;
        Integer num2 = 3;
        Double num3 = 7.15;
        Double num4 = 3.14;
        Integer num5 = 10;
        Integer num6 = 10 * 5 + 4;
        Integer num7 = 4 + 10 * 5;
        Integer num8 = 10 + 8 / 2 * 4;
        Integer num9 = (10 + 8 / 2) * 4;
        Integer num10 = ((10 + 8) / 2) * 4;
        Integer num11, num12;
        int i1 = 85 & 15;
        int i2 = 85 | 15;
        int i3 = 85 ^ 15;
        int i4 = ~85;
        int num13 = 7;
        int num14 = 4;
        int num15 = 4;

        num11 = num12 = 0;
        num11++;
        num12--;

        System.out.println(num1.toString() + " + " + num2.toString() + " = " + (num1 + num2));
        System.out.println(num1.toString() + " - " + num2.toString() + " = " + (num1 - num2));
        System.out.println(num1.toString() + " * " + num2.toString() + " = " + (num1 * num2));
        System.out.println(num1.toString() + " / " + num2.toString() + " = " + (num1 / num2));
        System.out.println(num1.toString() + " % " + num2.toString() + " = " + (num1 % num2));
        System.out.println(num3.toString() + " + " + num4.toString() + " = " + (num3 + num4));
        System.out.println("9.4 - 2.8 = " + (9.4 - 2.8));
        System.out.println("3.3 * 8.1 = " + (3.3 * 8.1));
        System.out.println("11.4 / 3.5 = " + (11.4 / 3.5));
        System.out.println("11.4 % 3.5 = " + (11.4 % 3.5));
        System.out.println(10 / 4);      // 2
        System.out.println(10.0 / 4.0);  // 2.5
        System.out.println(10 / 4.0);    // 2.5
        System.out.println(10.0 / 4);    // 2.5
        System.out.println(+num5);  // 10
        System.out.println(-num5);  // -10
        System.out.println("10 * 5 + 4 = " + num6);
        System.out.println("4 + 10 * 5 = " + num7);
        System.out.println("10 + 8 / 2 * 4 = " + num8);
        System.out.println("(10 + 8 / 2) * 4 = " + num9);
        System.out.println("((10 + 8) / 2) * 4 = " + num10);
        System.out.println("increment ++=" + num11);
        System.out.println("decrement --=" + num12);
        ++num11;
        --num12;
        System.out.println("increment ++=" + num11);
        System.out.println("decrement --=" + num12);
        System.out.println("85 & 15 = " + i1);
        System.out.println("85 | 15 = " + i2);
        System.out.println("85 ^ 15 = " + i3);
        System.out.println("~85 = " + i4);
        System.out.println(num13 < num14);  // false
        System.out.println(num13 <= num14); // false
        System.out.println(num13 > num14);  // true
        System.out.println(num13 >= num14); // true
        System.out.println(num13 == num14);  // false
        System.out.println(num13 == num15);  // false
        System.out.println(num14 == num15);  // true
        System.out.println(num13 != num14);  // true
        System.out.println(num13 != num15);  // true
        System.out.println(num14 != num15);  // false
    }
}
