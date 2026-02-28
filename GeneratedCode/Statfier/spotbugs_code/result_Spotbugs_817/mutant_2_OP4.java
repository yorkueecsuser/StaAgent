import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      System.out.println("This will run if shouldRun2 is true");
    } else {
      System.out.println("This is unreachable");
    }

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun3 = getCondition();
    if (shouldRun3) {
      System.out.println("This will run if shouldRun3 is true");
    } else {
      System.out.println("This is unreachable");
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun4 = getCondition();
    if (shouldRun4) {
      System.out.println("This will run if shouldRun4 is true");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the else block is theoretically unreachable
  }
}