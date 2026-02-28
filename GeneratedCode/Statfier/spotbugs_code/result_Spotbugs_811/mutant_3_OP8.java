class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();

    // Mutant code
    Thread x = new Thread();
    x.start();
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();

    // Mutant code
    Thread y = new Thread("Cool Thread");
    y.start();
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();

    // Mutant code
    ThreadGroup ug = new ThreadGroup("My Cool ThreadGroup");
    Thread z = new Thread(ug, "Cool Thread");
    z.start();
  }
}