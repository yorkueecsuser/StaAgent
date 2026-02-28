import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

class SkipBufferedInputStream {
  public static void main(String[] args) throws Exception {
    byte[] buffer = new byte[100];
    ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
    BufferedInputStream bis = new BufferedInputStream(bais, 50);

    byte[] smallBuf = new byte[10];

    bis.read(smallBuf);
    long available = bis.available();
    int request = 50;
    long s = bis.skip(request);
    if (s < available && s < request) {
      System.out.println("Skipped fewer bytes than requested and fewer bytes than available");
      System.out.println("Available: " + available);
      System.out.println("Requested: " + request);
      System.out.println("Skipped: " + s);
    }

    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable branch due to the condition always being false.");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}