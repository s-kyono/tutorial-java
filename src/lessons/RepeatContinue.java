package lessons;

public class RepeatContinue {
    public static void printlnValues() {
        Integer num = 0;


        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0){
                System.out.println("Continue End");
                continue;
            }
            System.out.println("i = " + i);
        }

        while (num < 9) {
            ++ num;

            if (num % 3 == 0) {
                System.out.println("Continue End");
                continue;
            }

            System.out.println("Value num="+ num);

        }

    }
}
