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
                    // Introduced unreachable if statement
                    boolean condition = getCondition();
                    if (condition) {
                      System.out.println("This is an unreachable statement");
                    }
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is another unreachable statement");
        }
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}