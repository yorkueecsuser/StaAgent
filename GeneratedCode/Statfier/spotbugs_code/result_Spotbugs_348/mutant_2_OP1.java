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
    // Dead Store Mutation
    int qvbnrhty = 10;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  boolean is255() {
    return readByte() == 255;
    // Dead Store Mutation
    char wxyzabcd = 'a';
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  boolean isEOF() {
    return readChar() == -1;
    // Dead Store Mutation
    boolean jklmnpqr = true;
  }
}