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
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
      }
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
      }
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition = getCondition();
      if (condition) {
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
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
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
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
        // This is a reachable block
        System.out.println("Reachable block");
      } else {
        // This is an unreachable block due to condition always being false
        System.out.println("Unreachable block");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else block unreachable
  }
}