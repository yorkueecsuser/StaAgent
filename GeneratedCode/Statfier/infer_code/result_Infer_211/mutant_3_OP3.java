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
      
      // Inserting unreachable if branch
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}