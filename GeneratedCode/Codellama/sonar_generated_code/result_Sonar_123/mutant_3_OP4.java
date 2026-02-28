import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      System.out.println("Infinite loop");
    }
  }
}

class UnreachableIfElse {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      System.out.println("Infinite loop");
      if (false) {
        break;
      }
    }
  }
}