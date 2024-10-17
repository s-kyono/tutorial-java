package lessons;

public class RepeatFor {
    public static void printlnValues() {
        Integer sum , num, abbreviationNum1, abbreviationNum2;
        int num3;
        Double num4;
        sum = num = abbreviationNum1 = abbreviationNum2= 0;
        /** for文 */
        for (int i = 0; i < 2; i++){
            System.out.println("i=" + i);
        }

        /** for 加算 */
        for (int i = 1; i <= 5; i++){
            System.out.println("for loop=" + i);
            sum += i;
        }

        /** for break */
        for (int i = 1; ; i++){
            num += i;
            if (num > 5){
                break;
            }
        }

        /** for 省略ケース:1 */
        for (; abbreviationNum1 < 100;){
            System.out.println(abbreviationNum1);
            if (abbreviationNum1 <= 0) {
                ++abbreviationNum1;
            }
            abbreviationNum1 *= 3;
        }

        /** for 省略ケース:2 */
        for (;;){
            System.out.println(abbreviationNum2);
            if (abbreviationNum2 <= 0) {
                ++abbreviationNum2;
            }
            abbreviationNum2 *= 3;
            if (abbreviationNum2 > 100){
              break;
            }
        }

        /** for 初期値複数版 */
        for (int i = 1, j = 5; i <= 5; i++, j--){
            System.out.println("i=" + i + ",j=" + j);
        }

        /** for 初期版 type */
        for (num3 = 1, num4 = 2.4; num3 <= 5; num3++){
            System.out.println("num3=" + num3 + ",num4=" + num4);
        }

        /** for入れ子版 */
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
              System.out.println("i = " + i + ", j = " + j);
            }
        }

        /** for入れ子版 */
        for (int i = 1; i < 3; i++){
            for (int j = 1; j < 3; j++){
                for (int k = 1; k < 3; k++){
                System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
        System.out.println(abbreviationNum1);
        System.out.println(abbreviationNum2);
        System.out.println("合計=" + sum);
        System.out.println("for break 合計=" + sum);
    }
}
