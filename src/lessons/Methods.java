package lessons;

public class Methods {
    int num1,num2;

    public void printlnValues() {
        int eigo = 78;
        int suugaku = 90;
        int nums[] = {10, 4};

        prints(nums);
        this.num1 = 10;
        this.num2 = 8;
        keisan(this.num1, this.num2);
        check("英語", eigo);
        check("数学", suugaku);
        hellobye();
        System.out.println("int value:" + String.valueOf(numValue()));
        System.out.println(plus(10, 7));
        System.out.println(plus(3.2, 4));
        System.out.println(plus(7, 1.223));
        System.out.println(plus(5.08, 2.4));
        System.out.println(sum(4, 10));
        System.out.println(sum(7, 2, 8));
        System.out.println(sum());
        disp("[", "]", 10, 7, 8);
        disp("【", "】", 128, 76);
        exceptionValue();
        exceptionFinallyValue();
    }

    private static void check(String value, int num) {
        System.out.print(value + "の試験結果は");
        if (num > 80){
          System.out.println("合格です");
        }else{
          System.out.println("不合格です");
        }
    }

    private static void hello(){
       System.out.println("こんにちは。");
    }

      private static void bye(){
        System.out.println("さようなら。");
      }

      private static void hellobye(){
        hello();
        bye();
      }

      private static void keisan(int num1, int num2){
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
      }

      private static void prints(int nums[]) {
        for (int i : nums) {
            System.out.println("i:" + String.valueOf(i));
        }
      }

      private static int numValue() {
        return 10;
      }

      private static int plus(int n1, int n2){
        System.out.println("int + int");
        return n1 + n2;
      }

      private static double plus(int n1, double d1){
        System.out.println("int + double");
        return n1 + d1;
      }

      private static double plus(double d1, int n1){
        System.out.println("double + int");
        return n1 + d1;
      }

      private static double plus(double d1, double d2){
        System.out.println("double + double");
        return d1 + d2;
      }

      private static int sum(int... nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
          sum += nums[i];
        }
        return sum;
      }

      private static void disp(String sb, String sa, int... num){
        for (int i = 0; i < num.length; i++){
          System.out.println(sb + num[i] + sa);
        }
      }

      private static void exceptionValue() {
        int n[] = {18, 29, 36};

        System.out.println("開始します");

        try{
          for (int i = 0; i < 4; i++){
            System.out.println(n[i]);
          }
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("配列の範囲を超えています");
        }
        System.out.println("終了しました");
      }

      private static void exceptionFinallyValue() {
        int n[] = {18, 29, 36};

        System.out.println("開始します");

        try{
          for (int i = 0; i < 4; i++){
            System.out.println(n[i]);
          }
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("配列の範囲を超えています");
        }
        finally{
          System.out.println("配列の出力を終了しました");
        }
        System.out.println("終了しました");
      }
}
