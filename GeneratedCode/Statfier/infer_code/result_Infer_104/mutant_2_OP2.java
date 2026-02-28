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
                  }
                }
                // Mutant: Duplicate the assignment of monitorA
                synchronized (monitorA) {
                  synchronized (monitorB) {
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
      }
    }
    // Mutant: Duplicate the assignment of monitorB
    synchronized (monitorB) {
      synchronized (monitorA) {
      }
    }
  }
}