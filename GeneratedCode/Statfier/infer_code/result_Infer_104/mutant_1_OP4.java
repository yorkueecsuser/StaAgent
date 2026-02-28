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
                      // Code that should never execute
                      System.out.println("This should never print");
                    } else {
                      // Alternative code that should also never execute
                      System.out.println("This should also never print");
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
          // Code that should never execute
          System.out.println("This should never print");
        } else {
          // Alternative code that should also never execute
          System.out.println("This should also never print");
        }
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}