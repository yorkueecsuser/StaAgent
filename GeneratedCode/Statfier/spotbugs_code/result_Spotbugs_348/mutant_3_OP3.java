import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2010_07_30 {

  byte readByte() {
    return 42;
  }

  char readChar() {
    return'';
  }

  @ExpectWarning("BIT_IOR_OF_SIGNED_BYTE")
  short readShort() {
    return (short) (readByte() << 8 | readByte());
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  boolean is255() {
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return true;
    }
    return readByte() == 255;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  boolean isEOF() {
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return false;
    }
    return readChar() == -1;
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if block unreachable
  }
}