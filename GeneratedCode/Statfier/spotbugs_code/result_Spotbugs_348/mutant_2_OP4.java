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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      int x = 10;
      x += 5;
    } else {
      // Some other unreachable code
      int y = 20;
      y -= 5;
    }
    return readByte() == 255;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  boolean isEOF() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      String s = "Hello";
      s = s.toUpperCase();
    } else {
      // Some other unreachable code
      String t = "World";
      t = t.toLowerCase();
    }
    return readChar() == -1;
  }

  private boolean getCondition() {
    return false;
  }
}