import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

class FindRRTest {
  public static void main(String[] args) throws Exception {
    BufferedInputStream bis = null;
    try {
      byte[] buffer = new byte[100];
      int i = 0;
      do {
        buffer[i] = (byte) i;
        i++;
      } while (i < 100);
      ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
      bis = new BufferedInputStream(bais, 50);

      byte[] smallBuf = new byte[10];

      bis.read(smallBuf);
      System.out.println(bis.available());
      long s = bis.skip(50);
      System.out.println(s);
      bis.read(smallBuf);

      System.out.println(smallBuf[0]);
      if (smallBuf[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + smallBuf[0]);
    } finally {
      if (bis!= null) bis.close();
    }
  }
}