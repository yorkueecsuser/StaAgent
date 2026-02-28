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
      int x = 1; // Mutated variable name from 'a' to 'x'
      int y = 2; // Mutated variable name from 'b' to 'y'
      int z = x + y; // Mutated variable name from 'c' to 'z'
      System.out.println("z: " + z);
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
      int m = 1; // Mutated variable name from 'a' to'm'
      int n = 2; // Mutated variable name from 'b' to 'n'
      int o = m + n; // Mutated variable name from 'c' to 'o'
      System.out.println("o: " + o);
    }
    synchronized (localLOCK) { // warning
      // Code...
      int p = 1; // Mutated variable name from 'a' to 'p'
      int q = 2; // Mutated variable name from 'b' to 'q'
      int r = p + q; // Mutated variable name from 'c' to 'r'
      System.out.println("r: " + r);
    }
  }
}