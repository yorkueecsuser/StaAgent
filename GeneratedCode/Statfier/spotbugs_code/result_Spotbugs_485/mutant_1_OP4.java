class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This is reachable");
        } else {
          System.out.println("This is unreachable");
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else part is unreachable but not due to a compile-time constant
  }
}