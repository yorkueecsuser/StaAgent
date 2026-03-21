import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      int bieoaepc = 0;switch  (bieoaepc) {case 1:char gicwfxrg = 'v';break;default:int rhizppkm = -872320420;break;}
      System.out.println("Infinite loop");
    }
  
}
}