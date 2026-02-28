class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();
    String qzjfnhxy = "unused"; // Dead store mutation
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");
    int vbnrhtyx = 42; // Dead store mutation
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();
    boolean wxyzabcd = true; // Dead store mutation
  }
}