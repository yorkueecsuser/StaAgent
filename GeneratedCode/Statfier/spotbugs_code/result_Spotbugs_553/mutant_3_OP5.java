class Ideas_2010_09_17 {
  private static int bufferSize = 0;

  private static int[] dataBuffer = new int[bufferSize];

  private void resize(int size) {
    synchronized (dataBuffer) {
      System.out.println("Entering synchronized block (resizing to: " + size + ")");
      bufferSize = size;
      if (dataBuffer.length < size) {
        dataBuffer = new int[size]; // danger modifying mutex!!!!

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("This is an unreachable case.");
            break;
          default:
            System.out.println("Default case.");
            break;
        }
      }
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println("Sleep was interrupted");
      }
      System.out.println("Exiting synchronized block");
    }
  }

  public static void main(String[] args) {
    new Thread(
            new Runnable() {
              @Override
              public void run() {
                Ideas_2010_09_17 instance1 = new Ideas_2010_09_17();
                instance1.resize(100);
              }
            })
       .start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Sleep was interrupted");
    }

    Ideas_2010_09_17 instance2 = new Ideas_2010_09_17();
    instance2.resize(10000);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the switch condition is always false
  }
}