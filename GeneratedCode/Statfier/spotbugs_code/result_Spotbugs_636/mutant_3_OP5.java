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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        flags += 100;
        break;
      case 1:
        // This case is always executed
        flags += 200;
        break;
    }

    return flags;
  }

  int xxxx, yyyy, zzzz;

  void setX(int xxx, int yyyy, int zzzz) {
    if (xxx < 0) throw new IllegalArgumentException();
    if (yyyy < 0) throw new IllegalArgumentException();
    if (zzzz < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;
  }

  void setX2(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    if (cccc < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;
  }

  void setX3(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}