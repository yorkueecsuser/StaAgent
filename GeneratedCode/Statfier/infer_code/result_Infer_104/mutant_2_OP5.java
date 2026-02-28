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
                    // Inserting an unreachable switch statement
                    boolean condition = getCondition();
                    switch (condition? 0 : 1) {
                      case 0:
                        // This case will never be reached because condition is always false
                        System.out.println("This will never print");
                        break;
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case will never be reached because condition is always false
            System.out.println("This will never print");
            break;
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}