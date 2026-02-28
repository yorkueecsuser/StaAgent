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
                    // Unreachable for loop
                    boolean conditionFor = getCondition();
                    for (int i = 0; conditionFor; i++) {
                      // This loop is unreachable because getCondition() returns false
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() returns false
        }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}