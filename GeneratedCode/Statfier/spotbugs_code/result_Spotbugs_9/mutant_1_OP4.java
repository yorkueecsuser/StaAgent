import junit.framework.TestCase;

/**
 * IJU: TestCase AccounterTest$1 has no tests I got this one for bringing mock objects in my test
 * code like this: public void testFoo() { doSomething(new FooBar() { public void
 * overrideSomeMethod() { //... } }); //... } Note that FooBar is not even derived from TestCase.
 */
class InnerClassInTestCaseFalsePositive extends TestCase {
  public void testFoo() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      doSomething(
          new Object() {
            public void overrideSomeMethod() {
              //...
            }
          });
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
    //...
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    return true; // This ensures the if block is executed and the else block is unreachable
  }
}