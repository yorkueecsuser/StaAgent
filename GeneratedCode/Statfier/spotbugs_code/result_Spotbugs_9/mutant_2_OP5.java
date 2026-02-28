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
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This is the only reachable case
        System.out.println("This is the reachable default case.");
        break;
    }
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    return false;
  }
}