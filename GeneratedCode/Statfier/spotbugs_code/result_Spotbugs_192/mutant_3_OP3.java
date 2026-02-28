import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
  }

  public void test() {
    new Thread(this).run();
    new Thread() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    }.start();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable in test");
    }
  }

  @Override
  public void run() {
    System.out.println("Hello");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable in run");
    }
  }

  public @CheckForNull String getFoo() {
    return null;
  }

  public int test(BufferedReader in) throws IOException {
    try {
      return in.readLine().hashCode() + getFoo().hashCode();
    } catch (NullPointerException e) {
      return 0;
    } finally {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        System.out.println("This is unreachable in test(BufferedReader)");
      }
    }
  }

  public int test2() {
    try {
      String x = getFoo();
      return x.hashCode();
    } catch (NullPointerException e) {
      return 0;
    } finally {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        System.out.println("This is unreachable in test2");
      }
    }
  }

  public int test2(BufferedReader in) throws IOException {
    return in.readLine().hashCode() + getFoo().hashCode();
  }

  public int test3() {
    String x = getFoo();
    return x.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}