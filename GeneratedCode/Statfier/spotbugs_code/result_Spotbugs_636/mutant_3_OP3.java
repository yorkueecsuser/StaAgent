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

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      flags += 100; // This line is unreachable
    }

    flags |= args.length > 0? 1 : 0;
    return flags;
  }

  int xxxx, yyyy, zzzz;

  void setX(int xxx, int yyyy, int zzzz) {
    if (xxx < 0) throw new IllegalArgumentException();
    if (yyyy < 0) throw new IllegalArgumentException();
    if (zzzz < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      this.yyyy = yyyy; // This line is unreachable
    }
  }

  void setX2(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    if (cccc < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      this.zzzz = cccc; // This line is unreachable
    }
  }

  void setX3(int aaaa, int bbbb, int cccc) {
    if (aaaa < 0) throw new IllegalArgumentException();
    if (bbbb < 0) throw new IllegalArgumentException();
    this.xxxx = xxxx;

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      this.xxxx = aaaa; // This line is unreachable
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the if branches unreachable
  }
}