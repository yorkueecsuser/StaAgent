import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      boolean ydhfcrbw = false;while (ydhfcrbw && false && false && true && true && false && false && true && true && true && false && false) {short nqkzvzyh = -8251;}
      System.out.println("Infinite loop");
    }
  
}
}