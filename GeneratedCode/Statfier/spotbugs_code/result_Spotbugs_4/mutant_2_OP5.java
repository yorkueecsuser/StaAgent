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

    // Introduced unreachable switch statement
    boolean condition = false; // This variable ensures the switch is unreachable
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}