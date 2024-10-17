package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomArrays {
    public static void printlnValues() {
        /** 配列定義 */
        List<Integer> oldArray = Arrays.asList(1, 2,3,4,5);
        // List<Integer>型の配列の定義と初期化
        List<Integer> newArray = new ArrayList<>(oldArray);

        newArray.add(6);
        newArray.add(7);
        newArray.add(8);
        newArray.add(9);
        newArray.add(10);

        System.out.println("古い配列");

        IntStream.range(0, oldArray.size()).forEach(i -> {
            System.out.println("Index: " + i + ", Value: " + oldArray.get(i));
        });

        System.out.println("新しい配列");
        IntStream.range(0, newArray.size()).forEach(i -> {
            System.out.println("Index: " + i + ", Value: " + newArray.get(i));
        });


        /** 多次元配列 */
        int[][] num_1 = new int[2][];
        int[][] num_2 = {{87,54,67}, {76,92,48}};
        int[] allArrayValues = new int[3];
        num_1[0] = new int[3];
        num_1[1] = new int[3];
        num_1[0][0] = 87;
        num_1[0][1] = 58;
        num_1[0][2] = 72;
        num_1[1][0] = 74;
        num_1[1][1] = 92;
        num_1[1][2] = 80;

        Arrays.fill(allArrayValues, 10);

        /** 多次元配列 for */
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
              System.out.println("num_1[" + i + "][" + j + "] = " + num_1[i][j]);
            }
        }

        /** 多次元配列 for */
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
              System.out.println("num_2[" + i + "][" + j + "] = " + num_2[i][j]);
            }
        }

        /** 多次元配列 length for */
        for (int i = 0; i < num_2.length; i++){
            for (int j = 0; j < num_2[i].length; j++){
              System.out.println("num_2[" + i + "][" + j + "] = " + num_2[i][j]);
            }
        }

        for (int i : allArrayValues) {
            System.out.println(i);
        }

        int[] src = {12, 24, 18};

        /** シャローコピー・*/
        int[] shallowArray = src;
        /** ディープコピー・*/
        int[] deepArray = Arrays.copyOf(src, 3);

        shallowArray[0] = 500;
        System.out.println("shallowArray配列");
        for (int i : shallowArray) {
            System.out.println("shallowArray: " + i);
        }
        System.out.println("src配列");
        for (int i : src) {
            System.out.println("src: " + i);
        }
        System.out.println("deepArray配列");
        for (int i : deepArray) {
            System.out.println("deepArray: " + i);
        }

        /** 配列結合 */
        Integer[] array = {5, 2, 8, 1, 3};
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        String[] array3 = {"A", "B", "C"};
        String[] array4 = {"D", "E", "F"};
        int[] array5 = {85, 78, 92};
        int[] array6 = {85, 78, 92};
        int[][] array7 = {{85, 78}, {92,58}};
        int[][] array8 = {{85, 78}, {92,58}};


        // 新しい配列の作成 (サイズは2つの配列の合計)
        int[] result = new int[array1.length + array2.length];

        // array1の内容をコピー
        System.arraycopy(array1, 0, result, 0, array1.length);
        // array2の内容をコピー
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        // 2つの配列を連結して1つの配列に変換
        String[] result2 = Stream.concat(Stream.of(array3),Stream.of(array4)).toArray(String[]::new);

        System.out.println(Arrays.toString(result));
        System.out.println(String.join(", ", result2));

        // 配列比較
        System.out.println(Arrays.equals(array5, array6));
        System.out.println(Arrays.deepEquals(array7, array8));

        // 並び替え
        Arrays.sort(array);
        System.out.println("昇順ソート: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("降順ソート: " + Arrays.toString(array));

        // String出力
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.deepToString(array7));
        System.out.println(Arrays.deepToString(array8));
    }
}