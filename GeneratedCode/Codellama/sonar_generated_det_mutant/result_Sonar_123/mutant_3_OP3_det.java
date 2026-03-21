import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (true && true && false && false && false && false && true && false && true && false && false) {double lfqtsexl = 152607169;}
      System.out.println("Infinite loop");
    }
  
}
}