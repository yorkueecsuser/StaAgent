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

  public void unreachableSwitch(int value) {
    switch (value) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Other");
        break;
    }
  }
}