class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
    String yjfqzvnm = "unused"; // Dead Store mutation
  }

  public void test1() {
    Thread t = new Thread();
    t.start();
    int xwvfrtgb = 42; // Dead Store mutation
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();
    boolean qazwsxed = true; // Dead Store mutation
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();
    char cvbnmhty = 'a'; // Dead Store mutation
  }
}