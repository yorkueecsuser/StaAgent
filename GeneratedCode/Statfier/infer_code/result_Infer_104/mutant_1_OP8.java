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
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
      }
    }

    // Mutant code
    Object x = monitorA;
    Object y = monitorB;

    Thread u =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (x) {
                  synchronized (y) {
                  }
                }
              }
            });
    u.start();

    synchronized (y) {
      synchronized (x) {
      }
    }
  }
}