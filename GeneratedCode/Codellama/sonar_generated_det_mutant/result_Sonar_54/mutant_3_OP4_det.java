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
    if (true && true && false && true && true && true && false && false && false && true && false) {int zshndcya = 788466219;}else{byte pqiqvmcz = 67;}
    throw new AssertionError("My assertion error");
  
}
}