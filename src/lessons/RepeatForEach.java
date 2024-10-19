package lessons;

public class RepeatForEach {
    public static void printlnValues() {
        String names[] = {"Suzuki", "Katou", "Yamada"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        for (String name: names){
            System.out.println("私の名前は..." + name + "です。");
        }
    }

}
