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
                // Mutant: Duplicate of the outer synchronized block
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
    // Mutant: Duplicate of the outer synchronized block
    synchronized (monitorB) {
      synchronized (monitorA) {
      }
    }
  }
}