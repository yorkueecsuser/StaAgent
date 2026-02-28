class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
    // Dead Store Mutation
    String abcdexyz = "unusedVariable";
  }

  public void foo() {
    System.out.println("howdy!");
    // Dead Store Mutation
    int qwertyui = 42;
  }

  public Runnable yarg() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
        // Dead Store Mutation
        boolean hjklmnop = true;
      }
    };
  }

  public String[] mutable = new String[] {"A", "B", "C"};
}