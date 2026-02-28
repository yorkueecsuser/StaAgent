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
  
  // Mutation Operator: Unreachable while loop
  // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
  public static void unreachableLoop() {
    boolean condition = getCondition();
    while (condition) {
      // This loop is unreachable because the condition is always false
      System.out.println("Unreachable loop");
    }
  }
  
  private static boolean getCondition() {
    return false;
  }
}