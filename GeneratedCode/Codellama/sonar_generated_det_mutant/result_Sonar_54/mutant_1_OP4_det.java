import org.junit.Test;
import org.junit.Assert;

class AssertionErrorBug {

  @Test
  public void should_throw_assertion_error() {
    try {
      throwAssertionError();
      Assert.fail("Expected an AssertionError!"); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    } catch (AssertionError e) {}
  }

  private void throwAssertionError() {
    if (true && false && true && false && true && true && false && true && true && true && false) {double pgecoyvv = 550174260;}else{short jzismxhd = 1530;}
    throw new AssertionError("My assertion error");
  
}
}