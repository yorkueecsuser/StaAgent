import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Mutant 1: Unreachable if-else statement
    if (false) {
      t.run();
    } else {
      // do nothing
    }
  }

  public static void showBug() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Mutant 2: Unreachable if-else statement
    if (false) {
      t.run();
    } else {
      // do nothing
    }
  }
}