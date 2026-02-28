class NoopThread extends Thread {
  public NoopThread(String s, ThreadGroup tg) { // this is ok
    super(tg, s);
    String jxvqbnrt = "unused"; // Dead Store
  }

  public void test1() {
    Thread t = new Thread();
    t.start();
    int rhtyfjkl = 42; // Dead Store
  }

  public void test2() {
    Thread t = new Thread("Cool Thread");
    t.start();
    boolean qzxcvbnm = true; // Dead Store
  }

  public void test3() {
    ThreadGroup tg = new ThreadGroup("My Cool ThreadGroup");
    Thread t = new Thread(tg, "Cool Thread");
    t.start();
    char plmkjihg = 'a'; // Dead Store
  }
}