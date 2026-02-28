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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside LOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside LOCK synchronization.");
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside nsLOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside nsLOCK synchronization.");
      }
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside fLOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside fLOCK synchronization.");
      }
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside fnsLOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside fnsLOCK synchronization.");
      }
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside parmLOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside parmLOCK synchronization.");
      }
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block inside localLOCK synchronization.");
      } else {
        // This block is unreachable if shouldRun is false
        System.out.println("This is an unreachable block inside localLOCK synchronization.");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the else block unreachable
  }
}