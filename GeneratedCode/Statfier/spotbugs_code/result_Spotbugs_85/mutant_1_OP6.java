class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  @Override
  protected void finalize() {
    System.gc();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  public void bad() {
    System.gc();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable loop */ }
  }

  private boolean getCondition() {
    return false;
  }
}