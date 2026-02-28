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
}

// Mutant 1: Renamed variable "t" to "thread"
class ThreadBug {
  public static void main(String[] args) {
    Thread thread = new Thread();
    thread.run(); // BUG: "Thread.run()" should not be called directly
  }

  public static void showBug() {
    Thread thread = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    thread.run(); // BUG: "Thread.run()" should not be called directly
  }
}

// Mutant 2: Renamed variable "t" to "thr"
class ThreadBug {
  public static void main(String[] args) {
    Thread thr = new Thread();
    thr.run(); // BUG: "Thread.run()" should not be called directly
  }

  public static void showBug() {
    Thread thr = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    thr.run(); // BUG: "Thread.run()" should not be called directly
  }
}