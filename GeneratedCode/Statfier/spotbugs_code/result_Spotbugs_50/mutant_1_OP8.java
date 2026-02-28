class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  // Mutant variable introduced
  private final String a;

  public Bug1978215() {
    m_thread = new Thread(this);
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
    a = "Mutant variable";
  }

  @Override
  public void run() {
    System.out.println(m_msg);
  }

  public static void main(String[] args) throws InterruptedException {
    new Bug1978215();
    Thread.sleep(1000);
  }
}