class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};
}