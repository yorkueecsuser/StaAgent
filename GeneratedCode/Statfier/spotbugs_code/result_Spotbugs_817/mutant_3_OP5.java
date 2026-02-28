import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}