class Bug1978215 implements Runnable {
  private final Thread m_thread;

  private final String m_msg;

  public Bug1978215() {
    m_thread = new Thread(this);
    m_thread.start();
    Thread.yield();
    m_msg = "Hello world!";
    
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
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

  // Method to return a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}