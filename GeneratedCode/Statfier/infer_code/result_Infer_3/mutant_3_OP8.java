import codetoanalyze.java.annotation.Lockless;

class LocklessTests {}

interface Listener {
  @Lockless
  void locklessMethod();

  void normalMethod();
}

class LocklessTestsA implements Listener {
  // should warn
  @Override
  public void locklessMethod() {
    synchronized (this) {
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
    synchronized (this) {
    }
  }

  // Mutant
  private int x;
  private int y;

  private void methodA() {
    int z = x + y;
    System.out.println(z);
  }

  private void methodB() {
    int a = x * y;
    System.out.println(a);
  }
}

class LocklessTestsB implements Listener {
  // should warn
  @Lockless
  @Override
  public synchronized void locklessMethod() {}

  // no warnings here
  @Override
  public synchronized void normalMethod() {}

  // Mutant
  private boolean flag;
  private boolean status;

  private void checkFlag() {
    if (flag) {
      status = true;
    } else {
      status = false;
    }
  }

  private void printStatus() {
    System.out.println(status);
  }
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {}

  // Mutant
  private double price;
  private double discount;

  private void calculatePrice() {
    double finalPrice = price - (price * discount);
    System.out.println(finalPrice);
  }

  private void applyDiscount() {
    discount = 0.1;
  }
}