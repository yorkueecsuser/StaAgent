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
    // Introducing a synthetic assignment for mutation purposes
    int syntheticVariable = 0;
    syntheticVariable = 0; // Duplicated assignment
    //...
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }
}