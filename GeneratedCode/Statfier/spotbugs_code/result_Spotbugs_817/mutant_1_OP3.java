import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);

    // Inserting another unreachable if statement
    boolean anotherCondition = getAnotherCondition();
    if (anotherCondition) {
      System.out.println("This is another unreachable statement");
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }

  private static boolean getAnotherCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}