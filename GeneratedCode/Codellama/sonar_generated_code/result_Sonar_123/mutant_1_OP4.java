import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
    }
    if (getCondition()) {
      System.out.println("Unreachable if-else statement added");
    } else {
      System.out.println("This branch is unreachable");
    }
  }
  
  private static boolean getCondition() {
    return false;
  }
}