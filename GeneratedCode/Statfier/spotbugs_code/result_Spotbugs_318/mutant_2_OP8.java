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

    // Mutated code
    BufferedInputStream q = null;
    try {
      byte[] x = new byte[100];
      for (int j = 0; j < 100; j++) x[j] = (byte) j;
      ByteArrayInputStream y = new ByteArrayInputStream(x);
      q = new BufferedInputStream(y, 50);

      byte[] z = new byte[10];

      q.read(z);
      System.out.println(q.available());
      long t = q.skip(50);
      System.out.println(t);
      q.read(z);

      System.out.println(z[0]);
      if (z[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + z[0]);
    } finally {
      if (q!= null) q.close();
    }
  }
}