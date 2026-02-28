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
}

/**
 * Mutated code for Renaming operator
 */
class InfiniteLoopBugMutant {
  public static void main(String[] args) {
    infiniteLoopMutant();
  }
  
  public static void infiniteLoopMutant() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
    }
  }
}