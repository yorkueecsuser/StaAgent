class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement");
    }
  }

  public void foo() {
    System.out.println("howdy!");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("Another unreachable if statement");
    }
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() always returns false
          System.out.println("Yet another unreachable if statement");
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};

  private boolean getCondition() {
    return false;
  }
}