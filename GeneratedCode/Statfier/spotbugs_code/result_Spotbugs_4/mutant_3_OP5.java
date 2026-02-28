import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class Ideas_2008_08_06<E> extends HashSet<E> {

  public int bar() {
    throw new UnsupportedOperationException();
  }

  public int foo() {
    return bar();
  }

  @ExpectWarning("GC,Dm")
  public static void main(String args[]) {
    Ideas_2008_08_06<String> i = new Ideas_2008_08_06<String>();
    System.out.println(i.contains(5));
    ScheduledThreadPoolExecutor e = new ScheduledThreadPoolExecutor(0);
    e.setMaximumPoolSize(10);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}