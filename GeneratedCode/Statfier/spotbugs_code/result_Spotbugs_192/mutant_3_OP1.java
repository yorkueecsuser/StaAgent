import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
    String qvbnrhty = "unused"; // Dead store
  }

  public void test() {
    new Thread(this).run();
    new Thread() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    }.start();
    int kxjvbnrj = 42; // Dead store
  }

  @Override
  public void run() {
    System.out.println("Hello");
    boolean tfghjklm = true; // Dead store
  }

  public @CheckForNull String getFoo() {
    return null;
    char zxcvbnml = 'a'; // Dead store
  }

  public int test(BufferedReader in) throws IOException {
    try {
      return in.readLine().hashCode() + getFoo().hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
    double asdfghjk = 3.14; // Dead store
  }

  public int test2() {
    try {
      String x = getFoo();
      return x.hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
    long poiuytrew = 123456789L; // Dead store
  }

  public int test2(BufferedReader in) throws IOException {
    return in.readLine().hashCode() + getFoo().hashCode();
    short qwertyui = 123; // Dead store
  }

  public int test3() {
    String x = getFoo();
    return x.hashCode();
    float yuiopasd = 2.71f; // Dead store
  }
}