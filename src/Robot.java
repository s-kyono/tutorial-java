/**
 * Java トーレニング クラス、メソッド、フィールドとは
 */
class Robot {
  int currentPosition = 0;

  void hello(){
    System.out.println("Hello");
  }

  void bye(){
    System.out.println("Bye");
  }

  void report(){
    System.out.println("Current Position = " + currentPosition);
  }

  void moveForward(){
    currentPosition = currentPosition + 1;
  }

  public static void main(String[] args){
    Robot robot = new Robot();
    robot.hello();
    robot.bye();
    robot.report();
    robot.moveForward();
    robot.report();
  }
}
