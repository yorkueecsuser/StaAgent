import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (false && true && false && false && true && false && false && false && false && false && false) {double xesvoabl = 531500414;}else{double lfzpgwor = 116040766;}
      System.out.println("Infinite loop");
    }
  
}
}