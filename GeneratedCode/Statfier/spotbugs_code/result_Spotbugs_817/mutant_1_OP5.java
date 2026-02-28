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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case will never be reached because alwaysFalse is false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case will also never be reached due to the same reason
        System.out.println("This will also never be printed");
        break;
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}