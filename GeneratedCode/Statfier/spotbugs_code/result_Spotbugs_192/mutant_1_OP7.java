import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @Override
  public void run() {
    System.out.println("Hello");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
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
    return false;
  }
}