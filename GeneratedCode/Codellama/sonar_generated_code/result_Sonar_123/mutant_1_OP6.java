import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");

      // MUTANT: Unreachable for loop
      for (int i = 0; false; i++) {
        break;
      }
    }
  }
}