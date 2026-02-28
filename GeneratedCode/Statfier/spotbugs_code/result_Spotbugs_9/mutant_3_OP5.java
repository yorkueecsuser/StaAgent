import junit.framework.TestCase;

/**
 * IJU: TestCase AccounterTest$1 has no tests I got this one for bringing mock objects in my test
 * code like this: public void testFoo() { doSomething(new FooBar() { public void
 * overrideSomeMethod() { //... } }); //... } Note that FooBar is not even derived from TestCase.
 */
class InnerClassInTestCaseFalsePositive extends TestCase {
  public void testFoo() {
    doSomething(
        new Object() {
          public void overrideSomeMethod() {
            //...
          }
        });
    //...

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is unreachable code");
        break;
      default:
        // Default case
        break;
    }
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}