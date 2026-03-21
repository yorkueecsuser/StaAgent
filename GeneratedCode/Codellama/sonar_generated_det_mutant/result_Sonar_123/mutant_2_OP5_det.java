import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      int vejgfxsy = 0;switch  (vejgfxsy) {case 1:float mizrisco = -960902906;break;default:String owyjlcss = "ibskhpqn";break;}
      System.out.println("Infinite loop");
    }
  
}
}