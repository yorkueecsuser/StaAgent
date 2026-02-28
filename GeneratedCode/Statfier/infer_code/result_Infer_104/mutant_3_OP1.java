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
                    // Dead store mutation
                    String qzjxmwfn = "unusedVariable";
                  }
                }
              }
            });
    t.start();

    synchronized (monitorB) {
      synchronized (monitorA) {
        // Dead store mutation
        int vbnrhtyf = 42;
      }
    }
  }
}