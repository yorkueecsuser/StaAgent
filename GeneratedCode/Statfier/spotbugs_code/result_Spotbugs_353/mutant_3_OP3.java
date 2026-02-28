import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
    return this;
  }

  public Bug2824716a foo() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
    return this;
  }

  public void test() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
    new Bug2824716a().append().foo();
  }

  private boolean getCondition() {
    return false;
  }
}