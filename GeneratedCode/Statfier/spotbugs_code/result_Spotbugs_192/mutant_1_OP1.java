import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
    // Dead store mutation
    int abcdefgh = 42;
  }

  public void test() {
    new Thread(this).run();
    new Thread() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    }.start();
    // Dead store mutation
    String ijklmnop = "unused";
  }

  @Override
  public void run() {
    System.out.println("Hello");
    // Dead store mutation
    boolean qrstuvwx = true;
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
    // Dead store mutation
    double yzabcdef = 3.14;
  }

  public int test2() {
    try {
      String x = getFoo();
      return x.hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
    // Dead store mutation
    char ghijklmn = 'a';
  }

  public int test2(BufferedReader in) throws IOException {
    return in.readLine().hashCode() + getFoo().hashCode();
    // Dead store mutation
    float opqrstuv = 2.71f;
  }

  public int test3() {

    String x = getFoo();
    return x.hashCode();
    // Dead store mutation
    long wxyzabcd = 100L;
  }
}