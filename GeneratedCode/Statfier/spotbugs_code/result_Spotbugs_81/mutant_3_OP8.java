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
      // no call to super.genericMethod( obj )
    }
  }

  // Mutated code starts here
  class AnotherConcreteClass extends GenericClass<Integer> {
    @Override
    public void genericMethod2(Integer z) {
      // no call to super.genericMethod( z )
    }
  }

  class YetAnotherDerivedClass extends AnotherConcreteClass {
    @Override
    public void genericMethod2(Integer y) {
      // no call to super.genericMethod( y )
    }
  }
}