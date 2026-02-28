class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();

    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This will never be printed");
        break;
    }
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();

    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This will never be printed either");
        break;
    }
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();

    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch is unreachable
  }
}