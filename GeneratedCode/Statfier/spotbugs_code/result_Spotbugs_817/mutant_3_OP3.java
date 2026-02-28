import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    
    // Unreachable if statement mutation
    boolean condition2 = getCondition();
    if (condition2) {
      System.out.println("This is another unreachable statement");
    }

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    
    // Unreachable if statement mutation
    boolean condition3 = getCondition();
    if (condition3) {
      System.out.println("Yet another unreachable statement");
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
    
    // Unreachable if statement mutation
    boolean condition4 = getCondition();
    if (condition4) {
      System.out.println("One more unreachable statement");
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This will always return false, but the compiler cannot determine this at compile time
  }
}