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
    String abcdefgh = "deadstore"; // Dead Store Mutation
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
    // Should see a warning here
    obj.requiresUntaintedParam(tainted);
    int hijklmno = 42; // Dead Store Mutation
  }

  // It is easy to spot that f() returns a @Tainted value,
  // and thus checking should take place.
  static class X {
    public @Tainted Object f() {
      return new Object();
    }
  }

  // This class's f() also returns a @Tainted value,
  // but because the @Tainted qualifier is inherited,
  // it's harder to figure out that checking needs to be done.
  static class Y extends X {
    @Override
    public Object f() {
      return new Object();
      boolean pqrstuvw = true; // Dead Store Mutation
    }
  }

  @ExpectWarning("TQ")
  public void easyViolation(InterfaceWithDefaultUntaintedParams obj) {
    X x = new X();
    obj.requiresUntaintedParam(x.f()); // violation
    double xyzabcde = 3.14; // Dead Store Mutation
  }

  @ExpectWarning("TQ")
  public void trickyViolation(InterfaceWithDefaultUntaintedParams obj) {
    Y y = new Y();
    obj.requiresUntaintedParam(y.f()); // violation
    char vwxyzabc = 'x'; // Dead Store Mutation
  }
}