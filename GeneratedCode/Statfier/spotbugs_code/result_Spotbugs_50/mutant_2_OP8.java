class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  public Bug1978215() {
    m_thread = new Thread(this);
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
    
    // Mutant code
    Thread t = m_thread;
    String s = m_msg;
  }

  @Override
  public void run() {
    System.out.println(m_msg);
    
    // Mutant code
    System.out.println(s);
  }

  public static void main(String[] args) throws InterruptedException {
    new Bug1978215();
    Thread.sleep(1000);
    
    // Mutant code
    Thread z = Thread.currentThread();
  }
}