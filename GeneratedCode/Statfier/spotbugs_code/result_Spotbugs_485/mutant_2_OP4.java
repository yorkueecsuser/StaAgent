class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is the reachable part
      System.out.println("This is reachable");
    } else {
      // This is the unreachable part due to the condition always being false
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This is the reachable part
          System.out.println("This is reachable in runnable");
        } else {
          // This is the unreachable part due to the condition always being false
          System.out.println("This is unreachable in runnable");
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};
}