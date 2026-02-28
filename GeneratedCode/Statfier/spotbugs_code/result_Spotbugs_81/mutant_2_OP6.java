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
      
      // Unreachable for loop inserted here
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is dynamically determined to be false
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}