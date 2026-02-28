class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();
    // Mutant: Renaming variable's' to 'a'
    String a = new String("World");
    a = a.trim();
    a.trim();
    new RV();
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");
    // Mutant: Renaming variable 'd' to 'x'
    java.security.MessageDigest x = java.security.MessageDigest.getInstance("SHA-256");
    x.digest(b);
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();
    // Mutant: Renaming variable 'file' to 'y'
    java.io.File y = new java.io.File("example.txt");
    y.createNewFile();
  }
}