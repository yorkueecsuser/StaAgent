class MainMethod {

  static Object monitorA, monitorB;

  public static void main(String args[]) {
    boolean conditionFor = getCondition();

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (monitorA) {
                  synchronized (monitorB) {
                    // Unreachable for loop
                    for (int i = 0; conditionFor; i++) {
                      // This loop is unreachable because conditionFor is false
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Unreachable for loop
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is false
        }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}