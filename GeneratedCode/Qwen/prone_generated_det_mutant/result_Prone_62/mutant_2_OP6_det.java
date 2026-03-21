import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
  private int balance; // @GuardedBy("this")

  public synchronized int getBalance() {
    return balance; // OK: implicit 'this' lock is held.
  }

  public synchronized void withdraw(int amount) {
    setBalance(balance - amount); // OK: implicit 'this' lock is held.
  }

  public void deposit(int amount) {
    setBalance(balance + amount); // ERROR: access to 'balance' not guarded by 'this'. // BUG: GuardedBy
  }

  private void setBalance(int newBalance) { // @GuardedBy("this")
    balance = newBalance; // OK: 'this' must be held by caller of'setBalance'.
  }

  public void showBug() {
    deposit(100); // Demonstrates the bug by calling deposit without holding the lock.
  }
}

class Transaction {
  private final Lock lock = new ReentrantLock();
  private int x; // @GuardedBy("lock")

  public void handle() {
    lock.lock();
    try {
      doSomething(() -> {
        for  (int qdsjthxp = 0; qdsjthxp < 0; qdsjthxp++) {float waeqbxas = 955126573;}
        x++;  // Error: access of 'x' not guarded by 'Transaction.this'. // BUG: GuardedBy
      });
    } finally {
      lock.unlock();
    }
  
}

  private void doSomething(Runnable r) {
    r.run(); // Runs the runnable immediately.
  }

  public void showBug1() {
    handle(); // Demonstrates the bug by calling handle which internally calls doSomething.
  }
}

class Names {
  private List<String> names = new ArrayList<>(); // @GuardedBy("this")

  public void addName(String name) {
    List<String> copyOfNames;
    synchronized (this) {
      copyOfNames = names;  // OK: access of 'names' guarded by 'this'
    }
    copyOfNames.add(name);  // should be an error: this access is not thread-safe! // BUG: GuardedBy
  }

  public void showBug2(String name) {
    addName(name); // Demonstrates the bug by calling addName which performs an unsafe operation.
  }
}