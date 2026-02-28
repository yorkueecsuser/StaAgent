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
          System.out.println("Case 1");
          break;
        case 2:
          System.out.println("Case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch is unreachable but not due to a compile-time constant
  }

  private int getValue() {
    return 0; // This is just a placeholder value
  }
}