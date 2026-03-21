import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      for  (int ltqpxekn = 0; ltqpxekn < 0; ltqpxekn++) {String pnaenela = "grhagzfb";}
      System.out.println("Infinite loop");
    }
  
}
}