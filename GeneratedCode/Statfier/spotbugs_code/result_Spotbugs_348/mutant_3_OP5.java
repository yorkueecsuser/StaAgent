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
    return readByte() == 255;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  boolean isEOF() {
    return readChar() == -1;
  }

  // Introduced unreachable switch statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          // This case is unreachable because getValue() always returns 0
          System.out.println("This will never be printed");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }

  // Method to provide a dynamic value for switch
  private int getValue() {
    return 0;
  }
}