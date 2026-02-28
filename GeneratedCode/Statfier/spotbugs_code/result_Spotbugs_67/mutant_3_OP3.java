import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.Tainted;
import javax.annotation.meta.When;
import jsr305.package1.InterfaceWithDefaultUntaintedParams;

class TestViolatedInheritedAnnotations implements I1, I2 {
  @Foo(when = When.ALWAYS)
  Object always;

  @Foo(when = When.NEVER)
  Object never;

  @Bar(
      when = When.MAYBE,
      strArrField = {"yip", "yip"},
      cField = 'Q',
      eArrField = {When.UNKNOWN})
  Object barField;

  @Override
  @ExpectWarning("TQ")
  public Object alwaysReturnFoo1() {
    return never;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @Override
  @ExpectWarning("TQ")
  public Object neverReturnFoo1() {
    return always;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  // This method inherits parameter and return value annotations from I1
  @Override
  @ExpectWarning("TQ")
  public Object alwaysReturnFooParams1(Object alwaysParam, Object neverParam) {
    return neverParam;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  @ExpectWarning("TQ")
  public void needsUntaintedParam(
      @Tainted Object tainted, InterfaceWithDefaultUntaintedParams obj) {
    // Should see a warning here
    obj.requiresUntaintedParam(tainted);
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in needsUntaintedParam.");
    }
  }

  // It is easy to spot that f() returns a @Tainted value,
  // and thus checking should take place.
  static class X {
    public @Tainted Object f() {
      return new Object();
      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Unreachable statement in X.f().");
      }
    }
  }

  // This class's f() also returns a @Tainted value,
  // but because the @Tainted qualifier is inherited,
  // it's harder to figure out that checking needs to be done.
  static class Y extends X {
    @Override
    public Object f() {
      return new Object();
      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Unreachable statement in Y.f().");
      }
    }
  }

  @ExpectWarning("TQ")
  public void easyViolation(InterfaceWithDefaultUntaintedParams obj) {
    X x = new X();
    obj.requiresUntaintedParam(x.f()); // violation
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in easyViolation.");
    }
  }

  @ExpectWarning("TQ")
  public void trickyViolation(InterfaceWithDefaultUntaintedParams obj) {
    Y y = new Y();
    obj.requiresUntaintedParam(y.f()); // violation
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in trickyViolation.");
    }
  }

  // Method to provide a dynamic condition for unreachable if statements
  private boolean getCondition() {
    return false; // This will always return false, making the if blocks unreachable
  }
}