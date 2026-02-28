class InvokeGC {
  public static void main(String[] argv) {
    String qwejklmn; // Dead store
    System.gc();
    System.currentTimeMillis();
  }

  @Override
  protected void finalize() {
    int abcdwxyz; // Dead store
    System.gc();
  }

  public void bad() {
    double hijklmno; // Dead store
    System.gc();
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      char rstuvwxy; // Dead store
      System.gc();
    }
  }

  public void tricky() {
    float pqrsabcd; // Dead store
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
  }

  public void tricky2() {
    long efghijkl; // Dead store
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
  }
}