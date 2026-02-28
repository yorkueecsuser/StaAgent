class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();

    // Mutant addition: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");

    // Mutant addition: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();

    // Mutant addition: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}