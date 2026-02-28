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

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case will also not be reached due to the same reason
          System.out.println("This is also an unreachable case");
          break;
      }
    } finally {
      if (bis!= null) bis.close();
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }

  public static void main(String[] args) {
    try {
      test();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}