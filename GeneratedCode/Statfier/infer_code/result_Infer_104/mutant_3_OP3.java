class MainMethod {

  static Object monitorA, monitorB;

  public static void main(String args[]) {
    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorA) {
                  synchronized (monitorB) {
                    boolean condition = getCondition();
                    if (condition) {
                      // Unreachable code
                      System.out.println("This is unreachable code in the thread.");
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is unreachable code in the main method.");
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if branches are unreachable
  }
}