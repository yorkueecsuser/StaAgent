import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Mutant 1: Duplicating the assignment statement for variable "t"
    Thread t1 = new Thread();
    t1.run(); // BUG: "Thread.run()" should not be called directly
  }

  public static void showBug() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Mutant 2: Duplicating the assignment statement for variable "t"
    Thread t1 = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t1.run(); // BUG: "Thread.run()" should not be called directly
  }
}