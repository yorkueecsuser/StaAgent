class Bug1941804 {
  private static String LOCK = "LOCK";

  private String nsLOCK = "LOCK";

  private static final String fLOCK = "LOCK";

  private final String fnsLOCK = "LOCK";

  public Bug1941804() {
    super();
  }

  public void methodSynchronize(String parmLOCK) {
    String localLOCK = "LOCK";
    synchronized (LOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor1 = getCondition();
      for (int i = 0; conditionFor1; i++) {
        // Unreachable for loop
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor2 = getCondition();
      for (int i = 0; conditionFor2; i++) {
        // Unreachable for loop
      }
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor3 = getCondition();
      for (int i = 0; conditionFor3; i++) {
        // Unreachable for loop
      }
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor4 = getCondition();
      for (int i = 0; conditionFor4; i++) {
        // Unreachable for loop
      }
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor5 = getCondition();
      for (int i = 0; conditionFor5; i++) {
        // Unreachable for loop
      }
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean conditionFor6 = getCondition();
      for (int i = 0; conditionFor6; i++) {
        // Unreachable for loop
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}