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
      // This is the original code block
      doSomething(
          new Object() {
            public void overrideSomeMethod() {
              //...
            }
          });
      //...
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable branch");
    }
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    // This method returns a condition that is always true, ensuring the else branch is unreachable
    return true;
  }
}