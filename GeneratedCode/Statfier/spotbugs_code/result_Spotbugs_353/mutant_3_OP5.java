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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition? 0 : 1 will always evaluate to 1
        System.out.println("This is unreachable");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  private boolean getCondition() {
    // This method returns a constant false, ensuring the switch is unreachable
    return false;
  }
}