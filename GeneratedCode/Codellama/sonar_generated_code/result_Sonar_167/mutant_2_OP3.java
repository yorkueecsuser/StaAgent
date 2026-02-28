import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    t.run(); // BUG: "Thread.run()" should not be called directly
  }

  public static void showBug() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t.run(); // BUG: "Thread.run()" should not be called directly
  }

  // Unreachable if statement
  public static void unreachableIfStatement(boolean condition) {
    if (condition) {
      // code
    }
    if (false) {
      // unreachable code
    }
  }

  // Unreachable while loop
  public static void unreachableWhileLoop(boolean conditionWhile) {
    while (conditionWhile) {
      // code
    }
    while (false) {
      // unreachable code
    }
  }

  // Unreachable for loop
  public static void unreachableForLoop(boolean conditionFor) {
    for (int i = 0; conditionFor; i++) {
      // code
    }
    for (int i = 0; false; i++) {
      // unreachable code
    }
  }

  // Unreachable if-else statement
  public static void unreachableIfElseStatement(boolean shouldRun) {
    if (shouldRun) {
      // code
    } else {
      // alternative code
    }
    if (false) {
      // code
    } else {
      // alternative code
    }
  }

  // Unreachable switch statement
  public static void unreachableSwitchStatement(int value) {
    switch(value) {
      case 1: // code
      break;
    }
    switch(0) {
      case 1: // code
      break;
    }
  }
}