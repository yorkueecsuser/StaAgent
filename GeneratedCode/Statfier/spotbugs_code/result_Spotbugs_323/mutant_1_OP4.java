import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

class SkipBufferedInputStream2 {
  public static void main(String[] args) throws Exception {
    byte[] buffer = new byte[100];
    ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
    BufferedInputStream bis = new BufferedInputStream(bais, 50);

    byte[] smallBuf = new byte[10];
    byte[] largeBuf = new byte[50];

    bis.read(smallBuf);
    long available = bis.available();
    long r = bis.read(largeBuf);
    if (r < available && r < largeBuf.length) {
      System.out.println("Read fewer bytes than requested and fewer bytes than available");
      System.out.println("Available: " + available);
      System.out.println("Requested: " + largeBuf.length);
      System.out.println("Read: " + r);
    }

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is always false.");
    } else {
      System.out.println("This will also never be printed because shouldRun is always false.");
    }
  }

  // Method to return a constant false condition
  private static boolean getCondition() {
    return false;
  }
}