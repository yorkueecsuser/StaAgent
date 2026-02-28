import junit.framework.TestCase;

/**
 * IJU: TestCase AccounterTest$1 has no tests I got this one for bringing mock objects in my test
 * code like this: public void testFoo() { doSomething(new FooBar() { public void
 * overrideSomeMethod() { //... } }); //... } Note that FooBar is not even derived from TestCase.
 */
class InnerClassInTestCaseFalsePositive extends TestCase {
  public void testFoo() {
    int temp = 0; // Introduced for mutation purpose
    int temp = 0; // Duplicate of the above line as per mutation operator

    doSomething(
        new Object() {
          public void overrideSomeMethod() {
            //...
          }
        });
    //...
  }

  private void doSomething(Object object) {
    // TODO Auto-generated method stub

  }
}