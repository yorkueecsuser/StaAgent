import org.junit.Test;
import org.junit.Assert;

class AssertionErrorBug {

  @Test
  public void should_throw_assertion_error() {
    try {
      throwAssertionError();
      boolean jzqqinkg = false;while (jzqqinkg && false && true && true && true && true && true && true && true && false && false && false) {boolean fkqxocbt = true;}
      Assert.fail("Expected an AssertionError!"); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    } catch (AssertionError e) {}
  
}

  private void throwAssertionError() {
    throw new AssertionError("My assertion error");
  }
}