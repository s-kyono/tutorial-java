import lessons.AssociativeArray;
import lessons.ConditionalBranch;
import lessons.CustomArrays;
import lessons.Encoding;
import lessons.JavaString;
import lessons.Literal;
import lessons.Methods;
import lessons.Operator;
import lessons.Persol;
import lessons.RepeatContinue;
import lessons.RepeatFor;
import lessons.RepeatForEach;
import lessons.RepeatWhile;
import lessons.VariableAndData;

public class App {
  public static void main(String[] args) {
    Persol persol = new Persol();
    Encoding encoding = new Encoding();
    Literal literal = new Literal();
    VariableAndData variableAndData = new VariableAndData();
    CustomArrays customsArrays = new CustomArrays();
    Operator operator = new Operator();
    RepeatFor repeatFor = new RepeatFor();
    RepeatWhile repeatWhile = new RepeatWhile();
    RepeatForEach repeatForEach = new RepeatForEach();
    RepeatContinue repeatContinue = new RepeatContinue();
    ConditionalBranch conditionalBranch = new ConditionalBranch();
    AssociativeArray associativeArray = new AssociativeArray();
    JavaString javaString = new JavaString();
    Methods methods = new Methods();

    persol.hello();
    literal.printlnValues();
    variableAndData.init();
    operator.printlnValues();
    repeatFor.printlnValues();
    repeatWhile.printlnValues();
    repeatForEach.printlnValues();
    repeatContinue.printlnValues();
    conditionalBranch.printlnValues();
    customsArrays.printlnValues();
    associativeArray.printlnValues();
    javaString.printlnValues();
    methods.printlnValues();

    if (args.length < 3) {
      System.out.println("Usage: java DynamicEncodingExample <filename> <content> <encoding>");
      return;
    }

    String filename = args[0];
    String content = args[1];
    String charCode = args[2];
    try {
      encoding.writeFile(filename, content, charCode);
      String fileContent = encoding.readFile(filename, charCode);
      System.out.println(fileContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}