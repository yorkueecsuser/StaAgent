import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    int ncjixpyx = 0;switch  (ncjixpyx) {case 1:boolean aizajxnn = false;break;default:float qvftjrfa = -722621713;break;}
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