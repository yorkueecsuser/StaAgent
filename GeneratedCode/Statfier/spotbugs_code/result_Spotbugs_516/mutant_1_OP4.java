class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();

    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is technically unreachable, but the condition is not a compile-time constant
  }
}