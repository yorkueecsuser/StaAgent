import javax.annotation.OverridingMethodsMustInvokeSuper;

class NeedsCallOfSuper {
  public static class GenericClass<X> {
    @OverridingMethodsMustInvokeSuper
    public void genericMethod2(X obj) {}
  }

  class ConcreteClass extends GenericClass<String> {}

  class DerivedClass extends ConcreteClass {
    @Override
    public void genericMethod2(String obj) {
      int localVar = 0; // Introduced local variable assignment
      localVar = 1;     // Assignment statement to duplicate
      localVar = 1;     // Duplicated assignment statement
      // no call to super.genericMethod( obj )
    }
  }
}