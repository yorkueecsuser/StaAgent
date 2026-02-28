class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();
    Thread t1 = new Thread(); // Mutant: duplicated assignment statement
    t1.start();
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();
    ThreadGroup tg1 = new ThreadGroup("My Cool ThreadGroup"); // Mutant: duplicated assignment statement
    Thread t1 = new Thread(tg1, "Cool Thread");
    t1.start();
  }
}