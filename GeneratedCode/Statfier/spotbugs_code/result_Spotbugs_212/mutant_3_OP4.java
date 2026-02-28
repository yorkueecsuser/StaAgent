import badNaming.package1.BaseClassForBadNamingTests;

class ExtendedClassForBadNamingTests extends BaseClassForBadNamingTests
    implements AnInterface {

  public void test1(A a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  @Override
  public void test2(A a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  public void test3(A a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  public void callingMethod(A a) {
    test3(a);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}