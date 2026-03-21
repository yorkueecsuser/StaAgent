import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (true && true && true && false && true && true && true && false && true && true && false) {long lcxfofww = -216945798;}
      System.out.println("Infinite loop");
    }
  
}
}