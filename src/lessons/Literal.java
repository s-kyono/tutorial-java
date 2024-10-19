package lessons;

public class Literal {
  public static void printlnValues() {
    char c = '\'';
    String str1 = "私の名前は\"鈴木\"です";
    String str2 = "この魚の値段は\\250です";
    /** 浮動小数点数リテラルの表し方 */
    double d = 075e8;

    /** 数値リテラルにサフィックスを */
    double literalDouble1 = 3.2;
    double literalDouble2 = 3.2D;
    double literalFloat = 3.2F;

    /** 数値リテラルに桁区切り */
    int numDelimiter_1 = 8_200;
    int numDelimiter_2 = 34_125_910;
    int numDelimiter_3 = 0b1_11_11_10_10;
    int numDelimiter_4 = 0x3f02_ef01;
    double numDelimiter_5 = 3.14_15_78;

    /** 論理リテラル */
    boolean isValue_1 = 10 > 7;
    boolean isValue_2 = 5 == 4;


    System.out.println("こんにちは\nお元気ですか");
    System.out.println("エスケープ文字:" + c );
    System.out.println(str1);
    System.out.println(str2);
    /** 浮動小数点数リテラルの表し方 */
    System.out.println(3.12 + 5.72);
    System.out.println(d);
    System.out.println(18.225);
    System.out.println(5.23e3);
    System.out.println(1.816e10);
    System.out.println(7.5e-2);
    System.out.println(2.712e-6);
    System.out.println(3.52 + 17.4);

    /** 数値リテラル サフィックス */
    System.out.println(2200000000L);
    System.out.println("double:" + literalDouble1);
    System.out.println("double:" + literalDouble2);
    System.out.println("float:" + literalFloat);

    /** 数値リテラル 区切り */
    System.out.println("numDelimiter_1:" + numDelimiter_1);
    System.out.println("numDelimiter_2:" + numDelimiter_2);
    System.out.println("numDelimiter_3:" + numDelimiter_3);
    System.out.println("numDelimiter_4:" + numDelimiter_4);
    System.out.println("numDelimiter_5:" + numDelimiter_5);

    /** 論理リテラル */
    System.out.println("isValue_1:" + isValue_1);
    System.out.println("isValue_2:" + isValue_2);
  }
}
