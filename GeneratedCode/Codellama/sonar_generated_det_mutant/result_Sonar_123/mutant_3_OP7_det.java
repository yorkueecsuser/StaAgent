import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      boolean lgqdfmhg = false;while (lgqdfmhg && false && false && false && true && true && true && true && true && true && true && false) {String vyornmxq = "qgbsllvo";}
      System.out.println("Infinite loop");
    }
  
}
}