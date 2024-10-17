package lessons;

import java.util.List;

public class JavaString {
    public static void printlnValues() {
        char[] c = {'こ', 'ん', 'に', 'ち', 'は'};
        String msg = "こんにちは";
        String charMsg = new String(c);
        String msg1 = "Hello";
        String msg2 = msg1;
        String msg3 = "Hello";
        String msg4 = msg1;
        int i = 10;
        short s = 21;
        long l = 12L;
        double d = 7.82;
        boolean b = true;
        String sInt = "10";
        String sShort = "21";
        String sLong = "1200000";
        String sFloat = "3.14";
        String sDouble = "7.82";
        String sBoolean = "false";
        String str7 = "AAAAAAAA";
        String str8 = "AAAAAAAA";
        String str9 = "AAA";
        String str10 = "ABCD";
        String tokyo1 = "東京都港区";
        String tokyo2 = "東京都港区";
        String tokyo3 = "東京都";
        String tokyo4 = "東京都中央区";
        String tokyo5 = "東京都港区赤坂";
        /** これだと不要なテンポラリとなる */
        // String si = Integer.valueOf(i).toString();
        // String sl = Long.valueOf(l).toString();
        // String sd = Double.valueOf(d).toString();
        // String sb = Boolean.valueOf(b).toString();

        String si = String.valueOf(i);
        String ss = String.valueOf(s);
        String sl = String.valueOf(l);
        String sd = String.valueOf(d);
        String sb = String.valueOf(b);

        int str1 = Integer.parseInt(sInt);
        short  str2 = Short.parseShort(sShort);
        long  str3 = Long.parseLong(sLong);
        /** parseFloat()だと不要なテンポラリとなる  */
        Float  str4 = Float.valueOf(sFloat);
        double str5 = Double.parseDouble(sDouble);
        /** parseBoolean()だと不要なテンポラリとなる  */
        Boolean str6 = Boolean.valueOf(sBoolean);

        System.out.println(msg1);
        System.out.println(msg2);

        System.out.println("----");

        msg2 = "Bye!";

        System.out.println("msg:" + msg);
        System.out.println("charMsg:" + charMsg);

        System.out.println(msg1);
        System.out.println(msg2);

        System.out.println(si);
        System.out.println(ss);
        System.out.println(sl);
        System.out.println(sd);
        System.out.println(sb);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(msg3.equals(msg4));
        System.out.println(str7.compareTo(str8));
        System.out.println(str7.compareTo(str9));
        System.out.println(str7.compareTo(str10));
        System.out.println(tokyo1.compareTo(tokyo2));
        System.out.println(tokyo1.compareTo(tokyo3));
        System.out.println(tokyo1.compareTo(tokyo4));
        System.out.println(tokyo1.charAt(3) + ":" + Integer.toString(tokyo1.charAt(3)));
        System.out.println(tokyo4.charAt(3) + ":" + Integer.toString(tokyo4.charAt(3)));
        System.out.println(tokyo1.length());
        System.out.println(tokyo2.length());
        System.out.println(tokyo3.length());
        System.out.println(tokyo4.length());

        for (int ln = 0; ln < tokyo5.length(); ln++) {
            System.out.println( ln+ "；" + tokyo5.charAt(ln));
        }

        for (int ii = 0; ii < tokyo5.length(); ii++){
            System.out.println( ii + "；" + tokyo5.codePointAt(ii));
        }

        /** substring */
        System.out.println(tokyo5.substring(3, 5));  // 港区
        System.out.println(tokyo5.substring(5, 7));  // 赤坂
        System.out.println(tokyo5.substring(3, tokyo5.length()));

        String msg10 = " AB CD ";
        String msg100 = "\tAB CD\n";
        String msg1000 = "　AB CD　";
        String msg10000 =  "　AB CD　";
        String msg20 = "　AB CD　";
        String msg30 = "Apple";
        String msg40 = "Ｍｏｕｓｅ";
        String msg50 = "東京都";
        String msg60 = "港区";
        String msg70 = "Herro Java";
        List<String> strings = List.of("One", "Two", "Three");
        String msg80 = "Hello World";
        String msg90 = "東京都と京都府";
        String msg110 = "Apple";
        String regex = "A.*e";
        String msg120 = "airplane.png";
        String msg130 = "lemon.png";
        String msg140 = "apple.jpeg";
        String regex2 = "a.+png$";
        String regex3  = ";|:";
        String str = "赤色:青色;黄色:;";
        String regex4  = "aA|Aa|aa";
        String msg150 = "AA BB aA Aa CC aa";
        /** trim */
        System.out.println("[" + msg10 + "]");
        System.out.println("[" + msg10.trim() + "]");
        System.out.println("[" + msg100 + "]");
        System.out.println("[" + msg100.trim() + "]");
        System.out.println("[" + msg1000 + "]");
        System.out.println("[" + msg1000.trim() + "]");
        System.out.println("[" + msg10000.strip() + "]");
        System.out.println("[" + msg20 + "]");
        System.out.println("[" + msg20.strip() + "]");
        System.out.println("[" + msg20.stripLeading() + "]");
        System.out.println("[" + msg20.stripTrailing() + "]");
        /** UpperCase LowerCase */
        System.out.println(msg30.toUpperCase());  // APPLE
        System.out.println(msg40.toUpperCase());  // ＭＯＵＳＥ
        System.out.println(msg30.toLowerCase());  // apple
        System.out.println(msg40.toLowerCase());  // ｍｏｕｓｅ
        /** 文字列結合 */
        System.out.println(msg50.concat(msg60));
        System.out.println(msg50 + msg60);
        /** replace */
        System.out.println(msg70.replace('r', 'l'));
        System.out.println(tokyo5.replace("港区", "中央区"));
        /** join */
        System.out.println(String.join("-", "Apple", "Grape", "Melon"));
        System.out.println(String.join(" * ", strings));
        /** indexOf */
        System.out.println(msg80.indexOf((int)'o'));
        System.out.println(msg80.lastIndexOf((int)'o'));
        System.out.println(msg80.lastIndexOf((int)'o', 6));
        System.out.println(msg90.indexOf("京都"));
        System.out.println(msg90.lastIndexOf("京都"));
        /** matches */
        System.out.println(msg110.matches(regex));
        System.out.println(msg120.matches(regex2));
        System.out.println(msg130.matches(regex2));
        System.out.println(msg140.matches(regex2));
        /** 正規表現 */
        String[] result = str.split(regex3, 0);
        for (int xx = 0 ; xx < result.length; xx++) {
          System.out.println("[" + result[xx] + "]");
        }

        result = str.split(regex3, -1);
        for (int xx = 0 ; xx < result.length; xx++) {
          System.out.println("[" + result[xx] + "]");
        }

        result = str.split(regex3, 2);
        for (int xx = 0 ; xx < result.length; xx++) {
          System.out.println("[" + result[xx] + "]");
        }

        /** 正規表現 (置換) */
        System.out.println(msg150.replaceFirst(regex4, "AA"));
        System.out.println(msg150.replaceAll(regex4, "AA"));
    }
}
