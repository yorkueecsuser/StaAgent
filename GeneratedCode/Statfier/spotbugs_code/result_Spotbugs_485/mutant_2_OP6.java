class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is always false
        }
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}