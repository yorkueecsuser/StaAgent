class InvokeGC {
  public static void main(String[] argv) {
    int dummy = 0; // Introduced dummy assignment for demonstration
    dummy = 0;     // Duplicate of the above assignment
    System.gc();
    long time = System.currentTimeMillis(); // Original code
    long timeCopy = System.currentTimeMillis(); // Duplicate of the above assignment, but not method invocation
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

    int anotherDummy = 1; // Introduced dummy assignment for demonstration
    anotherDummy = 1;     // Duplicate of the above assignment
    System.gc();
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    int yetAnotherDummy = 2; // Introduced dummy assignment for demonstration
    yetAnotherDummy = 2;     // Duplicate of the above assignment
    System.gc();
  }
}