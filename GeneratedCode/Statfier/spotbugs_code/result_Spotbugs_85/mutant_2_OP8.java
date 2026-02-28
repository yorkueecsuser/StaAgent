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

  // Mutant 1: Renaming 'argv' to 'a'
  public static void main(String[] a) {
    System.gc();
    System.currentTimeMillis();
  }

  // Mutant 2: Renaming 'i' to 'b'
  public void tricky2Mutant() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int b = 0; b < 20; b++) System.out.println(b);
    System.gc();
  }
}