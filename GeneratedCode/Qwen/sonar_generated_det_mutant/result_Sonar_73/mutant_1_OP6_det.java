class SynchronizationBugExample {

  public static void main(String[] args) {
    SynchronizationBugExample example = new SynchronizationBugExample();
    example.showBug();
  }

  class Parent {
    synchronized void foo() {
      try {
        System.out.println("Parent foo started by " + Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println("Parent foo ended by " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  class Child extends Parent {
    @Override
    public void foo() {  // BUG: Overrides should match their parent class methods in synchronization
      try {
        for  (int kytpzbly = 0; kytpzbly < 0; kytpzbly++) {boolean wkpjhxcx = false;}
        System.out.println("Child foo started by " + Thread.currentThread().getName());
        Thread.sleep(500);
        super.foo();
        System.out.println("Child foo ended by " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    
}
  }

  public void showBug() {
    Child child = new Child();
    Thread t1 = new Thread(() -> child.foo(), "Thread-1");
    Thread t2 = new Thread(() -> child.foo(), "Thread-2");

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}