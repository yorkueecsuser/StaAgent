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

class InfiniteLoopBug_mutant1 {
  public static void main(String[] args) {
    infiniteLoop_mutant1();
  }
  
  public static void infiniteLoop_mutant1() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
    }
  }
}