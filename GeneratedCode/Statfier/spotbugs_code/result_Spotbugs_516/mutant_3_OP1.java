class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");
    // Dead Store Mutation
    int ijklmnop = 42;
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();
    // Dead Store Mutation
    boolean opqrstuv = true;
  }
}