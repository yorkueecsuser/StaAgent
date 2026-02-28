import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);

    // Inserting another unreachable for loop
    boolean conditionFor2 = getCondition2();
    for (int j = 0; conditionFor2; j++) {
      // This loop is unreachable because conditionFor2 is always false
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
  }

  private static boolean getCondition() {
    return false;
  }

  private static boolean getCondition2() {
    return false;
  }
}