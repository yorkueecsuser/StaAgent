class SynchronizationBugExample {

  public static class Parent {
    synchronized void foo() {
      // Simulate some work
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public static class Child extends Parent {
    @Override
    public void foo() {  // BUG: Overrides should match their parent class methods in synchronization
      // Simulate some work
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      super.foo();
    }
  }

  public void showBug() {
    Child child = new Child();
    Runnable task = child::foo;

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) {
    SynchronizationBugExample example = new SynchronizationBugExample();
    example.showBug();
  }
}