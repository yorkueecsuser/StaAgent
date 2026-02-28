import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This is also unreachable");
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);

    // Inserting another unreachable if-else statement
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      System.out.println("Another unreachable block");
    } else {
      System.out.println("Yet another unreachable block");
    }

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);

    // Inserting yet another unreachable if-else statement
    boolean shouldRun3 = getCondition();
    if (shouldRun3) {
      System.out.println("More unreachable code");
    } else {
      System.out.println("Even more unreachable code");
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);

    // Inserting one last unreachable if-else statement
    boolean shouldRun4 = getCondition();
    if (shouldRun4) {
      System.out.println("Final unreachable block");
    } else {
      System.out.println("Absolutely final unreachable block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}