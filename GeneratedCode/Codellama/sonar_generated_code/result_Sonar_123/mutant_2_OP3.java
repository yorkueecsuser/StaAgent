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
  }

  // Unreachable if statement
  public static void unreachableIf() {
    if (getCondition()) {
      System.out.println("This statement is unreachable");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}