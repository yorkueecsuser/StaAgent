class Bug1941804 {
  private static String LOCK = "LOCK";
  private static String LOCK2 = "LOCK"; // Added duplicate

  private String nsLOCK = "LOCK";
  private String nsLOCK2 = "LOCK"; // Added duplicate

  private static final String fLOCK = "LOCK";
  private static final String fLOCK2 = "LOCK"; // Added duplicate

  private final String fnsLOCK = "LOCK";
  private final String fnsLOCK2 = "LOCK"; // Added duplicate

  public Bug1941804() {
    super();
  }

  public void methodSynchronize(String parmLOCK) {
    String localLOCK = "LOCK";
    String localLOCK2 = "LOCK"; // Added duplicate

    synchronized (LOCK) {
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
    synchronized (nsLOCK) {
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int a2 = 1; // Added duplicate
      int b = 2;
      int b2 = 2; // Added duplicate
      int c = a + b;
      int c2 = a2 + b2; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c2: " + c2); // Added duplicate
    }
  }
}