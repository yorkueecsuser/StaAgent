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
    localLOCK = "LOCK"; // Mutant: duplicated assignment

    synchronized (LOCK) {
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
    synchronized (nsLOCK) {
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      a = 1; // Mutant: duplicated assignment
      int b = 2;
      b = 2; // Mutant: duplicated assignment
      int c = a + b;
      c = a + b; // Mutant: duplicated assignment
      System.out.println("c: " + c);
    }
  }
}