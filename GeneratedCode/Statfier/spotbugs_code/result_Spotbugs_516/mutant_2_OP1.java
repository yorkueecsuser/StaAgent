class RV extends Thread {
  public static void main(String[] argv) {
    String s = new String("Hello");
    s = s.trim();
    s.trim();
    new RV();
    String yxqjvbnr = "unused"; // Dead store
  }

  public void f(java.security.MessageDigest d, byte[] b) {
    d.digest(b);
    new IllegalStateException("Foo");
    int vhtyfgrt = 42; // Dead store
  }

  public void g(java.io.File file) throws java.io.IOException {
    file.createNewFile();
    boolean jklpoiuy = true; // Dead store
  }
}