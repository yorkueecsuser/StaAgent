import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@ThreadSafe
interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }
}

class Main {
  public static void main(String[] args) {
    C c = new C();
    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Hello, world!");
      }
    };
    c.foo(i);
  }

  public void showBug() {
    C c = new C();
    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Hello, world!");
      }
    };
    c.foo(i);
  }
}

// Unreachable switch statement mutation
switch (false) {
  case 1:
    // unreachable code
    System.out.println("This code is unreachable");
    break;
  case 2:
    // unreachable code
    System.out.println("This code is also unreachable");
    break;
  default:
    // default code
    System.out.println("This code is reachable");
    break;
}