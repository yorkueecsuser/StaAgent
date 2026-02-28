import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Inserted mutant: unreachable switch statement
    int value = 0;
    switch (value) {
      case 1:
        System.out.println("This code is unreachable");
        break;
      default:
        System.out.println("This code is also unreachable");
        break;
    }
  }

  public static void showBug() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t.run(); // BUG: "Thread.run()" should not be called directly
  }
}