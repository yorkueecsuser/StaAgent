import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }

  public static void infiniteLoop() {
    for (int i = 0; getCondition(); i++) {
      System.out.println("Infinite loop");
    }
  }
  
  public static boolean getCondition() {
    return false;
  }
}