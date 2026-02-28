class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in test1.");
    }
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in test2.");
    }
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in test3.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the condition is always false at runtime
  }
}