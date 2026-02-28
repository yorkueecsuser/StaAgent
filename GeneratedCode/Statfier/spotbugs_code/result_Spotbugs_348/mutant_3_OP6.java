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

  // Mutant code with an unreachable for loop
  void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}