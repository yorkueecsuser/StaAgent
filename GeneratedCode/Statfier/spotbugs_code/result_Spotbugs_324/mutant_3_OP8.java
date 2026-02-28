import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

class TestReadandSkipReturnShouldBeChecked {
  public static void test() throws Exception {
    BufferedInputStream bis = null;
    try {
      byte[] buffer = new byte[100];
      for (int i = 0; i < 100; i++) buffer[i] = (byte) i;
      ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
      bis = new BufferedInputStream(bais, 50);

      byte[] smallBuf = new byte[10];

      bis.read(smallBuf);
      bis.skip(50);
      bis.read(smallBuf);

      if (smallBuf[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + smallBuf[0]);
    } finally {
      if (bis!= null) bis.close();
    }

    // Mutated code
    BufferedInputStream xis = null;
    try {
      byte[] zbuffer = new byte[100];
      for (int j = 0; j < 100; j++) zbuffer[j] = (byte) j;
      ByteArrayInputStream zaix = new ByteArrayInputStream(zbuffer);
      xis = new BufferedInputStream(zaix, 50);

      byte[] ysmallBuf = new byte[10];

      xis.read(ysmallBuf);
      xis.skip(50);
      xis.read(ysmallBuf);

      if (ysmallBuf[0] == 60) System.out.println("Mutated It works");
      else throw new Exception("Better check the size returned by skip(): mutated read " + ysmallBuf[0]);
    } finally {
      if (xis!= null) xis.close();
    }
  }

  public static void main(String[] args) {
    try {
      test();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}