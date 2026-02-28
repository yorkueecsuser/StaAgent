import java.io.BufferedReader;
import java.io.IOException;
import javax.annotation.CheckForNull;

class Ideas_2010_08_30 implements Runnable {

  Ideas_2010_08_30() {
    new Thread(this).start();
  }

  public void test() {
    new Thread(this).run();
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
    return x.hashCode();
  }

  // Mutated code
  public int test4(BufferedReader b) throws IOException {
    try {
      return b.readLine().hashCode() + getFoo().hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
  }

  public int test5() {
    try {
      String y = getFoo();
      return y.hashCode();
    } catch (NullPointerException e) {
      return 0;
    }
  }

  public int test6(BufferedReader b) throws IOException {
    return b.readLine().hashCode() + getFoo().hashCode();
  }

  public int test7() {
    String z = getFoo();
    return z.hashCode();
  }
}