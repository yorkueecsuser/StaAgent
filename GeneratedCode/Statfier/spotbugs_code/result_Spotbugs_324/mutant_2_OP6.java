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

      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }

      bis.read(smallBuf);
      bis.skip(50);
      bis.read(smallBuf);

      if (smallBuf[0] == 60) System.out.println("It works");
      else throw new Exception("Better check the size returned by skip(): read " + smallBuf[0]);
    } finally {
      if (bis!= null) bis.close();
    }
  }

  public static void main(String[] args) {
    try {
      test();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}