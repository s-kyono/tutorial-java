package lessons;

public class ConditionalBranch {
    public static void printlnValues() {
        int num = 4;
        int[] classcode = {1,3,2};
        String[] name = {"鈴木","本田","遠藤"};

        if (num % 2 == 0){
            System.out.println("偶数です");
        }

        if (num >= 5){
            System.out.println(num + "は5以上です");
        } else {
            System.out.println(num + "は5以下です");
        }


        switch (num){
        case 1:
            System.out.println("Aクラス");
            break;
        case 2:
            System.out.println("Bクラス");
            break;
        case 3:
            System.out.println("Cクラス");
            break;
        case 4:
            System.out.println("Dクラス");
            break;
        default:
             System.out.println("あなたは他校の生徒です");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(name[i] + "さんは");
            switch(classcode[i]){
              case 1:
                System.out.println("Aクラスです");
                break;
              case 2:
                System.out.println("Bクラスです");
                break;
              case 3:
                System.out.println("Cクラスです");
            }
        }

        switch (num) {
            case 1:
                System.out.println("Aクラス");
                break;
            case 2:
                System.out.println("Bクラス");
                break;
            case 3:
                System.out.println("Cクラス");
                break;
            // case 4:
            //     System.out.println("Dクラス");
            //     break;
            default:
                 System.out.println("あなたは他校の生徒です");
        }

        switch(num){
            case 1:
            case 3:
            case 5:
              System.out.println("大当たり");
              break;
            case 2:
            case 4:
              System.out.println("残念賞");
          }
    }
}
