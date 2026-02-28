import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      System.out.println("Infinite loop");
    }
  }
  public static void unreachableSwitch() {
    int value = getValue();
    switch(value) {
      case 1:
        System.out.println("Reachable code");
        break;
      default:
        System.out.println("Unreachable code");
        break;
    }
  }
}