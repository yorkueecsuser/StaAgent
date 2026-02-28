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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop");
    }
    return never;
  }

  @Override
  @ExpectWarning("TQ")
  public Object neverReturnFoo1() {
    return always;
  }

  // This method inherits parameter and return value annotations from I1
  @Override
  @ExpectWarning("TQ")
  public Object alwaysReturnFooParams1(Object alwaysParam, Object neverParam) {
    return neverParam;
  }

  @ExpectWarning("TQ")
  public void needsUntaintedParam(
      @Tainted Object tainted, InterfaceWithDefaultUntaintedParams obj) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop");
    }
    // Should see a warning here
    obj.requiresUntaintedParam(tainted);
  }

  // It is easy to spot that f() returns a @Tainted value,
  // and thus checking should take place.
  static class X {
    public @Tainted Object f() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        System.out.println("This is an unreachable loop");
      }
      return new Object();
    }
  }

  // This class's f() also returns a @Tainted value,
  // but because the @Tainted qualifier is inherited,
  // it's harder to figure out that checking needs to be done.
  static class Y extends X {
    @Override
    public Object f() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        System.out.println("This is an unreachable loop");
      }
      return new Object();
    }
  }

  @ExpectWarning("TQ")
  public void easyViolation(InterfaceWithDefaultUntaintedParams obj) {
    X x = new X();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop");
    }
    obj.requiresUntaintedParam(x.f()); // violation
  }

  @ExpectWarning("TQ")
  public void trickyViolation(InterfaceWithDefaultUntaintedParams obj) {
    Y y = new Y();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This is an unreachable loop");
    }
    obj.requiresUntaintedParam(y.f()); // violation
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the loops unreachable
  }
}