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
    long availableCopy = bis.available(); // Duplicate assignment statement
    int request = 50;
    int requestCopy = 50; // Duplicate assignment statement
    long s = bis.skip(request);
    if (s < available && s < request) {
      System.out.println("Skipped fewer bytes than requested and fewer bytes than available");
      System.out.println("Available: " + available);
      System.out.println("Requested: " + request);
      System.out.println("Skipped: " + s);
    }
  }
}