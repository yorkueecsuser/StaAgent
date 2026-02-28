class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();

    // Mutant code
    Thread a = new Thread();
    a.start();
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();

    // Mutant code
    Thread b = new Thread("Cool Thread");
    b.start();
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();

    // Mutant code
    ThreadGroup c = new ThreadGroup("My Cool ThreadGroup");
    Thread d = new Thread(c, "Cool Thread");
    d.start();
  }
}