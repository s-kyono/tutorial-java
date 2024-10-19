import java.util.Arrays;

public class Calculator {
    private static final String[] operators = {"kake", "waru", "tasu", "hiku"};

    private static int val1, val2;

    private static String[] getOperators() {
        return operators;
    }

    private static boolean contains(String[] array, String target) {
        return Arrays.stream(array).anyMatch(target::equals);
    }

    private static Integer getIntNum(String value) throws Exception {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new Exception("Usage : java dentaku 数値 演算子 数値\n数値でない値が入力されています " + e.getMessage(), e);
        }
    }

    private static Double getCalculatorValue(int num1, String ope, int num2)  throws Exception {
        double result = 0;
        try {
            if (ope.equals("kake")){
                result = num1 * num2;
            } else if (ope.equals("tasu")) {
                result = num1 + num2;
            } else if (ope.equals("hiku")) {
                result = num1 - num2;
            } else if (ope.equals("waru")) {
                result = num1 / num2;

                if(result <=0) {
                    throw new Exception("割り算の結果が0以下のになりました。");
                }
            }

            return result;

        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        val1 = val2 = 0; /** 数字の初期値 */
        double value = 0;
        boolean errFlag = true;
        String ope; /** 演算子 */

        try {
            if (args.length != 3) {
                System.out.println("Usage : java dentaku 数値 演算子 数値");
                System.out.println("演算子は kake waru tasu hiku の4つです");
                System.exit(0);  /* プログラムを終了する */
            }
            val1 = getIntNum(args[0]);
            val2 = getIntNum(args[2]);
            ope = args[1];
            // if (ope.equals("kake") || ope.equals("waru") || ope.equals("tasu") || ope.equals("hiku")){
            //     errFlag = false;
            // }
            /** こっちでもOK */
            if (contains(operators, ope)) {
                errFlag = false;
            }

            if (errFlag) {
                System.out.println("演算子が異なります kake waru tasu hiku の4ついずれかを入力してください");
                return;
            }

            value = getCalculatorValue(val1, ope, val2);

            System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
            System.out.println("計算結果は " + String.valueOf(value)  + " です");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);  /* プログラムを終了する */
        }
    }
}
