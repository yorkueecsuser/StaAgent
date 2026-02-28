import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    String qvbnrhty = "unusedVariable"; // Dead Store mutation
    return this;
  }

  public Bug2824716a foo() {
    int xwzjvfph = 42; // Dead Store mutation
    return this;
  }

  public void test() {
    new Bug2824716a().append().foo();
  }
}