import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    return this;
  }

  public Bug2824716a foo() {
    return this;
  }

  public void test() {
    new Bug2824716a().append().foo();
    
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}