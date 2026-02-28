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

// Mutant 1: Renaming variable "t" to "thread"
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

// Mutant 2: Renaming variable "t" to "thread1"
class ThreadBug {
  public static void main(String[] args) {
    Thread thread1 = new Thread();
    thread1.run(); // BUG: "Thread.run()" should not be called directly
  }

  public static void showBug() {
    Thread thread1 = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    thread1.run(); // BUG: "Thread.run()" should not be called directly
  }
}