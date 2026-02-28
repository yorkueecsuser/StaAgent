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
                    // Mutant code: Unreachable if-else statement
                    boolean shouldRun = getCondition();
                    if (shouldRun) {
                      // Code that should never execute
                    } else {
                      // Alternative code that should also never execute
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Code that should never execute
        } else {
          // Alternative code that should also never execute
        }
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}