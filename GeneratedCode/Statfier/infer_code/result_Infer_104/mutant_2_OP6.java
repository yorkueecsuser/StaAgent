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
                    // Inserting unreachable for loop
                    boolean conditionFor = getCondition();
                    for (int i = 0; conditionFor; i++) {
                      // Unreachable code
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
        }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}