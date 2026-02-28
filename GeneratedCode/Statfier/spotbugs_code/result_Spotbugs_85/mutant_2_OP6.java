class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
    boolean conditionForMain = getCondition();
    for (int i = 0; conditionForMain; i++) {
      // Unreachable loop
    }
  }

  @Override
  protected void finalize() {
    System.gc();
    boolean conditionForFinalize = getCondition();
    for (int i = 0; conditionForFinalize; i++) {
      // Unreachable loop
    }
  }

  public void bad() {
    System.gc();
    boolean conditionForBad = getCondition();
    for (int i = 0; conditionForBad; i++) {
      // Unreachable loop
    }
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }
    boolean conditionForOk = getCondition();
    for (int i = 0; conditionForOk; i++) {
      // Unreachable loop
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
    boolean conditionForTricky = getCondition();
    for (int i = 0; conditionForTricky; i++) {
      // Unreachable loop
    }
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
    boolean conditionForTricky2 = getCondition();
    for (int i = 0; conditionForTricky2; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}