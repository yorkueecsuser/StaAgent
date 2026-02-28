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
      boolean condition1 = getCondition();
      if (condition1) {
        // Unreachable code
        System.out.println("This is an unreachable if statement.");
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition2 = getCondition();
      if (condition2) {
        // Unreachable code
        System.out.println("This is another unreachable if statement.");
      }
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition3 = getCondition();
      if (condition3) {
        // Unreachable code
        System.out.println("Yet another unreachable if statement.");
      }
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition4 = getCondition();
      if (condition4) {
        // Unreachable code
        System.out.println("And yet another unreachable if statement.");
      }
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition5 = getCondition();
      if (condition5) {
        // Unreachable code
        System.out.println("One more unreachable if statement.");
      }
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      boolean condition6 = getCondition();
      if (condition6) {
        // Unreachable code
        System.out.println("The last unreachable if statement.");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable at runtime.
  }
}