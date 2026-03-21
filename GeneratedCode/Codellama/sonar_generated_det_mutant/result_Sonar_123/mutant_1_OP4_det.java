import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (true && true && false && false && false && true && true && true && true && false && false) {byte gjrowunh = -102;}else{String ndjufdsq = "wveinusq";}
      System.out.println("Infinite loop");
    }
  
}
}