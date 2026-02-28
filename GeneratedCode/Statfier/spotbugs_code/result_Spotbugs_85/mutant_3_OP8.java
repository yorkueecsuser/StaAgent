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

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
  }

  // Mutated code starts here

  public static void main(String[] b) {
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
    } catch (OutOfMemoryError c) {
      System.gc();
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError d) {
      d.printStackTrace();
    }

    System.gc();
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int f = 0; f < 20; f++) System.out.println(f);
    System.gc();
  }
}