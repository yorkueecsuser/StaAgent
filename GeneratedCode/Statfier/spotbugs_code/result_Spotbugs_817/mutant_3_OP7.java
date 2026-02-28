import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    
    // Unreachable while loop mutation
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // This loop is unreachable because getCondition() returns false
    }

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    
    // Unreachable while loop mutation
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // This loop is unreachable because getCondition() returns false
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
    
    // Unreachable while loop mutation
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}