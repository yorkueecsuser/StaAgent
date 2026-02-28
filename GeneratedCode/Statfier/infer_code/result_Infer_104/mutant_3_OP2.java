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
                // Mutant: Duplicating the assignment of monitorA
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
    // Mutant: Duplicating the assignment of monitorB
    synchronized (monitorB) {
      synchronized (monitorA) {
      }
    }
  }
}