class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();
    // Mutant: Renaming variable's' to 'x'
    String x = new String("World");
    x = x.trim();
    x.trim();
    new RV();
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");
    // Mutant: Renaming variable 'd' to 'a'
    java.security.MessageDigest a = java.security.MessageDigest.getInstance("SHA-256");
    a.digest(b);
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();
    // Mutant: Renaming variable 'file' to 'y'
    java.io.File y = new java.io.File("example.txt");
    y.createNewFile();
  }
}