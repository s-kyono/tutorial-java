package lessons;

public class VariableAndData {
  public static void init() {
    int sum;
    /* まとめて宣言 */
    int old, height;
    /* まとめて宣言 (同単語でも識別可能) */
    long score, Score, SCORE;

    /* まとめて宣言 (代入) */
    int conclusionWidth, conclusionHeight, conclusionDepth;
    conclusionWidth = conclusionHeight = conclusionDepth = 0;

    /* 定数 */
    final float TAX = 0.1F;

    float price = 800 * (1 + TAX);

    old = 20;
    height = 184;
    sum = 58 + 72 + 90;

    score = old;
    Score = height;
    SCORE = sum;

    /** データ型 */
    int n = 100;
    long l = 12345678910L;
    double d = 3.14;
    float f = 3.14F;
    char c = '花';
    boolean b = true;

    /** 型推論 */
    var typeInterFaceold = 24;
    var typeInterFacename = "Yamada";


    int i1 = 123456789;
    float f1 = i1;

    long l2 = 1234567890123456789L;
    float f2 = l2;
    double d2 = l2;

    /** ラッパークラス */
    Integer i = Integer.valueOf(10);
    int val = i.intValue();


    /** データ型 [数値] */
    System.out.println("合計 " + sum);
    System.out.println("平均 " + sum / 3);
    System.out.println("年齢：" + old);
    System.out.println("身長：" + height);
    System.out.println("score 年齢：" + score);
    System.out.println("Score 身長：" + Score);
    System.out.println("SCORE 合計 " + SCORE);

    /** データ型 */
    System.out.println("n=" + n);
    System.out.println("l=" + l);
    System.out.println("d=" + d);
    System.out.println("f=" + f);
    System.out.println("c=" + c);
    System.out.println("b=" + b);

    System.out.println("i1=：" + i1);
    System.out.println("f1=：" + f1);
    System.out.println("l2=：" + l2);
    System.out.println("f2=：" + f2);
    System.out.println("d2=：" + d2);

    /** Free */
    System.out.println("conclusionWidth=" + conclusionWidth);
    System.out.println("conclusionHeight=" + conclusionHeight);
    System.out.println("conclusionDepth=" + conclusionDepth);
    System.out.println("typeInterFaceold:" + typeInterFaceold);
    System.out.println("typeInterFacename:" + typeInterFacename);
    System.out.println("TAX=" + TAX);
    System.out.println("price=" + price);
    System.out.println("i = " + val);
  }
}
