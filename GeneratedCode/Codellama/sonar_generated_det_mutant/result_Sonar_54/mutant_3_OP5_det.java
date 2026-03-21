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
    int qjxtfslf = 0;switch  (qjxtfslf) {case 1:char jihhkrpt = 'c';break;default:boolean hyfzfhim = true;break;}
    throw new AssertionError("My assertion error");
  
}
}