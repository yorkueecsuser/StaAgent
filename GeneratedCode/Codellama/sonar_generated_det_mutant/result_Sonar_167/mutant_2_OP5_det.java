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
    int dpulwyyb = 0;switch  (dpulwyyb) {case 1:char kpxvczyb = 'o';break;default:char vezrkiaa = 's';break;}
    t.run(); // BUG: "Thread.run()" should not be called directly
  
}
}