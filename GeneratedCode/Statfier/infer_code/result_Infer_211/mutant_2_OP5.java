class ByteBufferTest {

  class ByteBuffer {
    byte[] bufferBytes;

    int limit = 10;
    int pos = 0;

    public int getInt() {
      return bufferBytes[pos++];
    }

    public int remaining() {
      return limit - pos;
    }
  }

  public static int[] decodeMobileOnly(ByteBuffer buffer) {
    int[] dataUsage = new int[3];
    dataUsage[0] = buffer.getInt();
    return dataUsage;
  }

  // don't hoist remaining()
  void inner_change_don_hoist(ByteBuffer byteBuffer) {
    while (byteBuffer.remaining() > 0) {
      decodeMobileOnly(byteBuffer);

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This case is always executed
          break;
      }
    }
  }

  // Helper method to avoid using compile-time constants
  private boolean getCondition() {
    return false;
  }
}