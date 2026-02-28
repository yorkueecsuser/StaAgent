import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
      if (getCondition()) {
        break;
      }
    }
  }
  
  public static boolean getCondition() {
    return false;
  }
}