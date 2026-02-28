class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
  }

  public void test1() {
    Thread t = new Thread();
    t.start();
    Thread t1 = new Thread(); // Duplicate of the assignment statement
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();
    Thread t1 = new Thread("Cool Thread"); // Duplicate of the assignment statement
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();
    Thread t1 = new Thread(tg, "Cool Thread"); // Duplicate of the assignment statement
  }
}