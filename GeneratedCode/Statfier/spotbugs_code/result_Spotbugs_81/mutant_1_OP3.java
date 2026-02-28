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

      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}