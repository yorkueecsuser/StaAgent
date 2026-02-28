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
  public void report(A a) {
    // Report: first arg is declared @NonNull by A
    a.f(null, new Object());
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block due to condition.");
    }
  }

  public void doNotReport(B b) {
    // The B interface declared arg 2 to be @CheckForNull, so this is OK
    b.f(new Object(), null);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block due to condition.");
    }
  }

  public void report2(B b) {
    // arg1 must still not be null, though
    b.f(null, new Object());
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block due to condition.");
    }
  }

  public void report3(C c) {
    // C doesn't relax any constraints: A's constraints should apply
    c.f(new Object(), null);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block due to condition.");
    }
  }

  @Override
  public void f(Object obj, Object obj2) {
    System.out.println(obj.hashCode()); // ok, declared @NonNull

    System.out.println(obj2.hashCode()); // BAD - declared @CheckForNull
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block due to condition.");
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition check ensures it's dynamic
  }
}