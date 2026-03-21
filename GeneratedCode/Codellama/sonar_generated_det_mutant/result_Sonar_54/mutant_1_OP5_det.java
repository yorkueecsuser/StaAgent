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
    int pvtngede = 0;switch  (pvtngede) {case 1:float qzkqndxl = -317959212;break;default:long scuyuuqd = 126831133;break;}
    throw new AssertionError("My assertion error");
  
}
}