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
      
      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is reachable");
      } else {
        System.out.println("This is unreachable");
      }
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      
      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is reachable");
      } else {
        System.out.println("This is unreachable");
      }
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      
      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is reachable");
      } else {
        System.out.println("This is unreachable");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is technically unreachable, but the condition is not a compile-time constant
  }
}