class Ideas_2010_09_17 {
  private static int bufferSize = 0;

  private static int[] dataBuffer = new int[bufferSize];

  private void resize(int size) {
    synchronized (dataBuffer) {
      System.out.println("Entering synchronized block (resizing to: " + size + ")");
      bufferSize = size;
      if (dataBuffer.length < size) {
        dataBuffer = new int[size]; // danger modifying mutex!!!!

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is never set to true
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

    // Inserting unreachable for loop
    boolean conditionForMain = getCondition();
    for (int i = 0; conditionForMain; i++) {
      // This loop is unreachable because conditionForMain is never set to true
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}