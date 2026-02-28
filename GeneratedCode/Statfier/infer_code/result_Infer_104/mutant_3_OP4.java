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
                    // Inserting unreachable if-else statement
                    boolean shouldRun = getCondition();
                    if (shouldRun) {
                      System.out.println("This will run if shouldRun is true");
                    } else {
                      System.out.println("This is unreachable code");
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will run if shouldRun is true");
        } else {
          System.out.println("This is unreachable code");
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}