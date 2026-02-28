import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

interface A {
  public void f(@NonNull Object obj, @NonNull Object obj2);
}

interface B extends A {
  // relax constraint on second param
  @Override
  public void f(@NonNull Object obj, @CheckForNull Object obj2);
}

interface C extends A {}

class TestNonNull implements B {
  private boolean getCondition() {
    return false;
  }

  public void report(A a) {
    // Report: first arg is declared @NonNull by A
    a.f(null, new Object());

    // Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }
  }

  private int getValue() {
    return 0;
  }

  public void doNotReport(B b) {
    // The B interface declared arg 2 to be @CheckForNull, so this is OK
    b.f(new Object(), null);

    // Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  public void report2(B b) {
    // arg1 must still not be null, though
    b.f(null, new Object());

    // Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 3:
        System.out.println("Yet another unreachable block");
        break;
    }
  }

  public void report3(C c) {
    // C doesn't relax any constraints: A's constraints should apply
    c.f(new Object(), null);

    // Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 4:
        System.out.println("This block is unreachable too");
        break;
    }
  }

  @Override
  public void f(Object obj, Object obj2) {
    System.out.println(obj.hashCode()); // ok, declared @NonNull

    System.out.println(obj2.hashCode()); // BAD - declared @CheckForNull

    // Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 5:
        System.out.println("This is the last unreachable block");
        break;
    }
  }
}