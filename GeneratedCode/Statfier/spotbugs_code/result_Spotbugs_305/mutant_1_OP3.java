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
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}