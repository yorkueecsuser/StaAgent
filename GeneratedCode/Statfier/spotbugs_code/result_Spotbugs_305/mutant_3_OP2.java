class Bug1941804 {
  private static String LOCK = "LOCK";
  private static String LOCK_duplicate = "LOCK"; // Added duplicate

  private String nsLOCK = "LOCK";
  private String nsLOCK_duplicate = "LOCK"; // Added duplicate

  private static final String fLOCK = "LOCK";
  private static final String fLOCK_duplicate = "LOCK"; // Added duplicate

  private final String fnsLOCK = "LOCK";
  private final String fnsLOCK_duplicate = "LOCK"; // Added duplicate

  public Bug1941804() {
    super();
  }

  public void methodSynchronize(String parmLOCK) {
    String localLOCK = "LOCK";
    String localLOCK_duplicate = "LOCK"; // Added duplicate
    synchronized (LOCK) {
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
    synchronized (nsLOCK) {
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int a_duplicate = 1; // Added duplicate
      int b = 2;
      int b_duplicate = 2; // Added duplicate
      int c = a + b;
      int c_duplicate = c; // Added duplicate
      System.out.println("c: " + c);
      System.out.println("c_duplicate: " + c_duplicate); // Added duplicate
    }
  }
}