class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}