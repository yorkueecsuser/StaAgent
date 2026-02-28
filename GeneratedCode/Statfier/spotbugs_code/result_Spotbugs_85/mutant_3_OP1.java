class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    String qwejfnrt = "unused"; // Dead Store
    System.currentTimeMillis();
  }

  @Override
  protected void finalize() {
    int abcdexyz = 0; // Dead Store
    System.gc();
  }

  public void bad() {
    boolean rthjklpq = true; // Dead Store
    System.gc();
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      char vbnmlkjh = 'a'; // Dead Store
      System.gc();
    }
  }

  public void tricky() {
    double yuiopasd = 3.14; // Dead Store
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
  }

  public void tricky2() {
    long zxcvbnmQ = 123456789L; // Dead Store
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
  }
}