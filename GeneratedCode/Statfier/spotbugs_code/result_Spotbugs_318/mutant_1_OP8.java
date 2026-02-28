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
    BufferedInputStream x = null;
    try {
      byte[] y = new byte[100];
      for (int z = 0; z < 100; z++) y[z] = (byte) z;
      ByteArrayInputStream a = new ByteArrayInputStream(y);
      x = new BufferedInputStream(a, 50);

      byte[] b = new byte[10];

      x.read(b);
      System.out.println(x.available());
      long c = x.skip(50);
      System.out.println(c);
      x.read(b);

      System.out.println(b[0]);
      if (b[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + b[0]);
    } finally {
      if (x!= null) x.close();
    }
  }
}