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
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
    }
    synchronized (fLOCK) { // warning
      int x = 1; // mutant
      int y = 2; // mutant
      int z = x + y; // mutant
      System.out.println("z: " + z); // mutant
    }
    synchronized (fnsLOCK) { // warning
      int m = 1; // mutant
      int n = 2; // mutant
      int o = m + n; // mutant
      System.out.println("o: " + o); // mutant
    }
    synchronized (parmLOCK) {
      // Code...
      int p = 1; // mutant
      int q = 2; // mutant
      int r = p + q; // mutant
      System.out.println("r: " + r); // mutant
    }
    synchronized (localLOCK) { // warning
      // Code...
      int s = 1; // mutant
      int t = 2; // mutant
      int u = s + t; // mutant
      System.out.println("u: " + u); // mutant
    }
  }
}