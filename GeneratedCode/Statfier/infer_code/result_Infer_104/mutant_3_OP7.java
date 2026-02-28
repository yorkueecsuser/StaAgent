class MainMethod {

  static Object monitorA, monitorB;

  public static void main(String args[]) {
    boolean conditionWhile = getCondition();

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorA) {
                  synchronized (monitorB) {
                    // Unreachable while loop
                    while (conditionWhile) {
                      // This loop is unreachable because conditionWhile is set to a dynamic condition that evaluates to false
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Unreachable while loop
        while (conditionWhile) {
          // This loop is unreachable because conditionWhile is set to a dynamic condition that evaluates to false
        }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}