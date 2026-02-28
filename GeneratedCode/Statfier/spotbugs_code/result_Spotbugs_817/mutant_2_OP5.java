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
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will also never be printed");
        break;
      default:
        System.out.println("Default case, this will never be printed either");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1; // This will never be true
    } else {
      return 0; // This will always be true, but the switch cases are still unreachable
    }
  }
}