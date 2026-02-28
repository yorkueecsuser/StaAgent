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
      boolean condition = getCondition();
      if (condition) {
        // This block is intended to be unreachable
        System.out.println("This should never be printed");
      } else {
        // Alternative block
        System.out.println("This is the alternative block");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is always false at runtime
    }
  }
}