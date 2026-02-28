class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This will never be printed");
        break;
      case 1:
        // This is the reachable case
        break;
    }
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

  private boolean getCondition() {
    return false; // This method ensures the switch condition is dynamically determined
  }
}