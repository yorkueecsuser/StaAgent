class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
    System.currentTimeMillis(); // Duplicate of the previous method call
  }

  @Override
  protected void finalize() {
    System.gc();
    System.gc(); // Duplicate of the previous method call
  }

  public void bad() {
    System.gc();
    System.gc(); // Duplicate of the previous method call
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
      System.gc(); // Duplicate of the previous method call
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
    System.gc(); // Duplicate of the previous method call
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
    System.gc(); // Duplicate of the previous method call
  }
}