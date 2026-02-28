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

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will run if shouldRun is true.");
      } else {
        System.out.println("This is unreachable code.");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }
}