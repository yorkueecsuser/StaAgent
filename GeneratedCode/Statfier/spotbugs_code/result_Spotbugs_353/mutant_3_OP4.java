import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never be executed because condition is always false
      System.out.println("This is an unreachable else block.");
    }
    return this;
  }

  public Bug2824716a foo() {
    return this;
  }

  public void test() {
    new Bug2824716a().append().foo();
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}