class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
    String qzjfnxrm = "unusedVariable"; // Dead Store mutation
  }

  public void test1() {
    Thread t = new Thread();
    t.start();
    int kxvbnrht = 42; // Dead Store mutation
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();
    boolean wqejfpmn = true; // Dead Store mutation
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();
    char vbnrhtkj = 'a'; // Dead Store mutation
  }
}