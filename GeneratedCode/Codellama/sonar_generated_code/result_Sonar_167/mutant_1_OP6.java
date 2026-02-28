import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Unreachable for loop added to the main method
    for (int i = 0; false; i++) {
      System.out.println("This code is unreachable");
    }
  }

  public static void showBug() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("This is a bug");
      }
    });
    t.run(); // BUG: "Thread.run()" should not be called directly

    // Unreachable for loop added to the showBug method
    for (int i = 0; false; i++) {
      System.out.println("This code is unreachable");
    }
  }
}