class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
  }

  @Override
  protected void finalize() {
    System.gc();
  }

  public void bad() {
    System.gc();
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    int i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 20);
    System.gc();
  }
}