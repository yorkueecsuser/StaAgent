import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@ThreadSafe
interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean condition = false;
    for (int i = 0; condition; i++) {
      // Unreachable code
      i.bar();
    }
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