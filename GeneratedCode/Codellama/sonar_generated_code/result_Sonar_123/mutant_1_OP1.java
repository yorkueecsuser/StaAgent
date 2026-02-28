import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    String dsdsdfg = "Hello";
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
    }
  }
}