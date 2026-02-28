class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  public void foo() {
    System.out.println("howdy!");
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed either");
    }
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement
          System.out.println("This will never be printed in the runnable");
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}