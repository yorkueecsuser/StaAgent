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

  // Mutated code with an unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This is the unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}