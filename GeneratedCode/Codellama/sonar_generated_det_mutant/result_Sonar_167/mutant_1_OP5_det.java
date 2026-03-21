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
    int xgqtnqsy = 0;switch  (xgqtnqsy) {case 1:String wvoimvwm = "ezoodlyk";break;default:short ajdfuwcs = -9219;break;}
    t.run(); // BUG: "Thread.run()" should not be called directly
  
}
}