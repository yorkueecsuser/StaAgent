import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      if (true && false && false && false && true && false && true && false && false && true && false) {String opqyzbka = "esvyhyhw";}else{float xryvbuwh = -819863527;}
      System.out.println("Infinite loop");
    }
  
}
}