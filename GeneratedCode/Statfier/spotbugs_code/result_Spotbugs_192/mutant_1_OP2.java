import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
    new Thread(this).start(); // Mutant: duplicated assignment statement
  }

  public void test() {
    new Thread(this).run();
    new Thread(this).run(); // Mutant: duplicated assignment statement
    new Thread() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    }.start();
  }

  @Override
  public void run() {
    System.out.println("Hello");
  }

  public @CheckForNull String getFoo() {
    return null;
  }

  public int test(BufferedReader in) throws IOException {
    try {
      return in.readLine().hashCode() + getFoo().hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
  }

  public int test2() {
    try {
      String x = getFoo();
      String x_duplicate = getFoo(); // Mutant: duplicated assignment statement
      return x.hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
  }

  public int test2(BufferedReader in) throws IOException {
    return in.readLine().hashCode() + getFoo().hashCode();
  }

  public int test3() {
    String x = getFoo();
    String x_duplicate = getFoo(); // Mutant: duplicated assignment statement
    return x.hashCode();
  }
}