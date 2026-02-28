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

// Mutant 1: Duplicate the assignment statement `I i = new I() {...}`
I i = new I() {
  @Override
  public void bar() {
    System.out.println("Hello, world!");
  }
};
I i = new I() {
  @Override
  public void bar() {
    System.out.println("Hello, world!");
  }
};

// Mutant 2: Duplicate the assignment statement `C c = new C()`
C c = new C();
C c = new C();

// Mutant 3: Duplicate the method invocation `c.foo(i)`
c.foo(i);
c.foo(i);

// Mutant 4: Duplicate the declaration of `I i`
I i = new I() {
  @Override
  public void bar() {
    System.out.println("Hello, world!");
  }
};
I i = new I() {
  @Override
  public void bar() {
    System.out.println("Hello, world!");
  }
};

// Mutant 5: Duplicate the declaration of `C c`
C c = new C();
C c = new C();

// Mutant 6: Duplicate the entire `showBug()` method
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