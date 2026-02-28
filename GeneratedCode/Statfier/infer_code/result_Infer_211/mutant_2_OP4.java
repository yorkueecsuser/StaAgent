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
      // Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is an unreachable block");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}