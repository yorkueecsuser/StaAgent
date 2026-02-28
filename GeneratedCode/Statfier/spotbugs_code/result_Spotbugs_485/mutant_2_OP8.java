class F {
  private String blat, thud;

  private final int FOOBAR = 6;

  public F(String thud) {
    this.thud = thud;
  }

  public void foo() {
    System.out.println("howdy!");
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

  // Mutated code
  private String a, b;

  private final int BARFOO = 6;

  public F(String b) {
    this.b = b;
  }

  public void bar() {
    System.out.println("howdy!");
  }

  public Runnable zabr() {
    return new Runnable() {
      @Override
      public void run() {
        System.out.println("oh yeah");
      }
    };
  }

  public String[] zmutable = new String[] {"A", "B", "C"};
}