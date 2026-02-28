import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2010_07_30 {

  byte readByte() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return 42;
  }

  char readChar() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return'';
  }

  @ExpectWarning("BIT_IOR_OF_SIGNED_BYTE")
  short readShort() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return (short) (readByte() << 8 | readByte());
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  boolean is255() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return readByte() == 255;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  boolean isEOF() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return readChar() == -1;
  }

  private boolean getCondition() {
    return false;
  }
}