import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (false && false && true && true && true && true && false && false && false && true && false) {float btjzzehj = 553379193;}
      System.out.println("Infinite loop");
    }
  
}
}