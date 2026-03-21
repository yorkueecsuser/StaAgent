import java.util.List;
import java.util.ArrayList;

class ThreadBug {
  public static void main(String[] args) {
    Thread t = new Thread();
    if (false && false && false && true && false && false && false && false && false && true && false) {short utmtmvcg = 1043;}else{String rfyzjbjc = "hemqywxc";}
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