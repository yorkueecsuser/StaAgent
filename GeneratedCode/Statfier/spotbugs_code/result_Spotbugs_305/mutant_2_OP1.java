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
      // Dead store mutation
      String qyjvbnrt = "unused";
    }
    synchronized (nsLOCK) {
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      // Dead store mutation
      int xwvfrtgb = 42;
    }
    synchronized (fLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      // Dead store mutation
      boolean hgfdsazx = true;
    }
    synchronized (fnsLOCK) { // warning
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      // Dead store mutation
      char jklpoiuy = 'z';
    }
    synchronized (parmLOCK) {
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      // Dead store mutation
      double asdfghjk = 3.14;
    }
    synchronized (localLOCK) { // warning
      // Code...
      int a = 1;
      int b = 2;
      int c = a + b;
      System.out.println("c: " + c);
      // Dead store mutation
      float poiuytrew = 2.718f;
    }
  }
}