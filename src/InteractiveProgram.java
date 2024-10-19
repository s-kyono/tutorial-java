import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractiveProgram {

    // ユーザーの名前を取得するメソッド
    private static String getName(Scanner scanner) {
        System.out.println("こんにちは！あなたの名前は何ですか？");
        return scanner.nextLine();  // 名前を返す
    }

    // ユーザーの年齢を取得するメソッド
    private static int getAge(Scanner scanner) {
        int age = -1;
        while (true) {
            try {
                System.out.print("年齢を入力してください（数字のみ）：");
                age = scanner.nextInt();  // 年齢の入力
                if (age < 0) {
                    throw new IllegalArgumentException("年齢は0以上の数字でなければなりません。");
                }
                break;  // 正常な入力ならループを抜ける
            } catch (InputMismatchException e) {
                System.out.println("数字以外の値が入力されました。もう一度試してください。");
                scanner.next();  // 不正な入力を読み捨てる
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());  // カスタム例外メッセージを表示
            }
        }
        return age;
    }

    // ユーザーに挨拶するメソッド
    private static void greetUser(String name, int age) {
        System.out.println("こんにちは、" + name + "さん！" + age + "歳ですね。");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);  // 名前を取得
        int age = getAge(scanner);        // 年齢を取得

        greetUser(name, age);             // 挨拶を表示

        scanner.close();                  // リソースを解放
        System.out.println("プログラムを終了します。");
    }
}