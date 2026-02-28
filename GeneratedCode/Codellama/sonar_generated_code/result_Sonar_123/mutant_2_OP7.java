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
  
  // Unreachable while loop mutant
  public static void unreachableWhileLoop() {
    boolean condition = getCondition();
    while (condition) {
      System.out.println("Unreachable while loop");
    }
  }
  
  private static boolean getCondition() {
    return false;
  }
}