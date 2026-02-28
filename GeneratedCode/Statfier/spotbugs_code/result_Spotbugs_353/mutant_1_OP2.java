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
    int x = 5; // Introducing a local variable assignment
    int x = 5; // Duplicated assignment
    new Bug2824716a().append().foo();
  }
}