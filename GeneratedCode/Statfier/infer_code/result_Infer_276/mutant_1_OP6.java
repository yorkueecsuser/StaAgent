class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}