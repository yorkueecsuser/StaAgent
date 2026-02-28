import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in append method");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in append method");
    }
    return this;
  }

  public Bug2824716a foo() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in foo method");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in foo method");
    }
    return this;
  }

  public void test() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in test method");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in test method");
    }
    new Bug2824716a().append().foo();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}