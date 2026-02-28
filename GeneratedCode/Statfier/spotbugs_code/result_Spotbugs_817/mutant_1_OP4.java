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
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }

    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    
    // Inserting an unreachable if-else statement
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      System.out.println("This will run if shouldRun2 is true");
    } else {
      System.out.println("This is unreachable code");
    }

    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    
    // Inserting an unreachable if-else statement
    boolean shouldRun3 = getCondition();
    if (shouldRun3) {
      System.out.println("This will run if shouldRun3 is true");
    } else {
      System.out.println("This is unreachable code");
    }

    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
    
    // Inserting an unreachable if-else statement
    boolean shouldRun4 = getCondition();
    if (shouldRun4) {
      System.out.println("This will run if shouldRun4 is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}