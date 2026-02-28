class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  public Bug1978215() {
    m_thread = new Thread(this);
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
    // Dead Store Mutation
    String qwertyui = "unusedVariable";
  }

  @Override
  public void run() {
    System.out.println(m_msg);
    // Dead Store Mutation
    int asdfghjk = 42;
  }

  public static void main(String[] args) throws InterruptedException {
    new Bug1978215();
    Thread.sleep(1000);
    // Dead Store Mutation
    boolean zxcvbnmQ = true;
  }
}