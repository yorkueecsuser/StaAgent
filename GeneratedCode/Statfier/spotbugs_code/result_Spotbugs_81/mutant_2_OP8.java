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

  // Mutated code
  class ConcreteClass2 extends GenericClass<String> {
    @Override
    public void genericMethod2(String a) {
      // no call to super.genericMethod( a )
    }
  }

  class DerivedClass2 extends ConcreteClass2 {
    @Override
    public void genericMethod2(String b) {
      // no call to super.genericMethod( b )
    }
  }
}