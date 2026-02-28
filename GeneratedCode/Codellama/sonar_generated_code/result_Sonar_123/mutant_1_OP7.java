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
    while (false) {
      // Unreachable while loop
      System.out.println("Unreachable while loop");
    }
  }
}