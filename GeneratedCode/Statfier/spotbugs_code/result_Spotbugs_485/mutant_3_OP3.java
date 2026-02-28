class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    }
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is unreachable code in runnable");
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}