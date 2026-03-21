import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      for  (int gzacoxwy = 0; gzacoxwy < 0; gzacoxwy++) {String dasecnke = "jnpoldnv";}
      System.out.println("Infinite loop");
    }
  
}
}