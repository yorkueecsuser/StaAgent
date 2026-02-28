import java.net.InetAddress;
import java.net.UnknownHostException;

class Ideas_2009_02_27 {

  public static void main(String args[]) throws UnknownHostException {
    System.out.println(falsePositive(args));
  }

  public static int falsePositive(String args[]) throws UnknownHostException {
    int flags = 0;

    InetAddress.getAllByName("www.google.com");
    InetAddress.getByName("www.google.com");

    flags |= args.length > 0? 1 : 0;

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      flags += 100;
    } else {
      // This block will also never be executed because condition is always false
      flags -= 100;
    }

    return flags;
  }

  int xxxx, yyyy, zzzz;

  void setX(int xxx, int yyyy, int zzzz) {
    if (xxx < 0) throw new IllegalArgumentException();
    if (yyyy < 0) throw new IllegalArgumentException();
    if (zzzz < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      this.yyyy = 0;
    } else {
      // This block will also never be executed because condition is always false
      this.zzzz = 0;
    }
  }

  void setX2(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    if (cccc < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      this.yyyy = 0;
    } else {
      // This block will also never be executed because condition is always false
      this.zzzz = 0;
    }
  }

  void setX3(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      this.yyyy = 0;
    } else {
      // This block will also never be executed because condition is always false
      this.zzzz = 0;
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the branches are unreachable
    return false;
  }
}