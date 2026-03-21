import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      boolean thkmxraj = false;while (thkmxraj && true && false && false && true && false && true && true && false && false && true && false) {char vngiyicn = 'v';}
      System.out.println("Infinite loop");
    }
  
}
}