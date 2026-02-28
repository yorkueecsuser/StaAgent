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

  // Mutated code starts here
  public static void unreachableSwitchStatement() {
    int value = getValue();
    switch (value) {
      case 1: // This branch is unreachable
        System.out.println("Unreachable branch");
        break;
      case 2: // This branch is unreachable
        System.out.println("Unreachable branch");
        break;
      default:
        System.out.println("Default branch");
        break;
    }
  }

  // Mutated code ends here
}