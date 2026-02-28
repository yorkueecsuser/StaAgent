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

  // Mutated code
  public void badx() {
    System.gc();
  }

  public void okx() {
    try {
      System.out.println("okx()");
    } catch (OutOfMemoryError x) {
      System.gc();
    }
  }

  public void trickyx() {
    try {
      System.out.println("trickyx()");
    } catch (OutOfMemoryError x) {
      x.printStackTrace();
    }

    System.gc();
  }

  public void tricky2x() {
    try {
      System.out.println("trickyx()");
    } catch (OutOfMemoryError x) {
      x.printStackTrace();
    }

    for (int j = 0; j < 20; j++) System.out.println(j);
    System.gc();
  }
}