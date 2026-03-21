import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      for  (int ndtryiww = 0; ndtryiww < 0; ndtryiww++) {float hgoaayuu = 282889653;}
      System.out.println("Infinite loop");
    }
  
}
}