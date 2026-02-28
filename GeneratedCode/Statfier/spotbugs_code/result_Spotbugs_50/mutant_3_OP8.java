class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  // Mutant: Renamed m_thread to a
  private final Thread a;

  public Bug1978215() {
    m_thread = new Thread(this);
    a = new Thread(this); // Mutant: Added redundant initialization of 'a'
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
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