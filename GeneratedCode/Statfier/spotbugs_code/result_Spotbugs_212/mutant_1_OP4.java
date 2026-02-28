import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {}

  @Override
  public void test2(A a) {}

  public void test3(A a) {}

  public void callingMethod(A a) {
    test3(a);
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}