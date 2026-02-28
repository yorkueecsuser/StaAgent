class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  public Bug1978215() {
    m_thread = new Thread(this);
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  @Override
  public void run() {
    System.out.println(m_msg);
  }

  public static void main(String[] args) throws InterruptedException {
    new Bug1978215();
    Thread.sleep(1000);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}