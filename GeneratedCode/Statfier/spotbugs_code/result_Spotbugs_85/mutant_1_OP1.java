class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
    String xjvqzrtp = "unused"; // Dead store
  }

  @Override
  protected void finalize() {
    System.gc();
    int qzjfnrht = 42; // Dead store
  }

  public void bad() {
    System.gc();
    boolean rjxqfntw = true; // Dead store
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }
    double wjvqzrtp = 3.14; // Dead store
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
    char vjxqfntw = 'a'; // Dead store
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
    long gjvqzrtp = 123456789L; // Dead store
  }
}