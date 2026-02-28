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
                    // Inserting unreachable while loop
                    boolean conditionWhile = getCondition();
                    while (conditionWhile) {
                      // Unreachable code
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}