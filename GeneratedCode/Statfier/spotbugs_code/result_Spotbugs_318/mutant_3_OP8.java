import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

class FindRRTest {
  public static void main(String[] args) throws Exception {
    BufferedInputStream bis = null;
    try {
      byte[] buffer = new byte[100];
      for (int i = 0; i < 100; i++) buffer[i] = (byte) i;
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

    // Mutant code
    BufferedInputStream z = null;
    try {
      byte[] x = new byte[100];
      for (int j = 0; j < 100; j++) x[j] = (byte) j;
      ByteArrayInputStream y = new ByteArrayInputStream(x);
      z = new BufferedInputStream(y, 50);

      byte[] w = new byte[10];

      z.read(w);
      System.out.println(z.available());
      long v = z.skip(50);
      System.out.println(v);
      z.read(w);

      System.out.println(w[0]);
      if (w[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + w[0]);
    } finally {
      if (z!= null) z.close();
    }
  }
}