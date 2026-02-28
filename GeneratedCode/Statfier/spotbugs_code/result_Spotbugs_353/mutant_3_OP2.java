import javax.annotation.CheckReturnValue;
import javax.annotation.meta.When;

@CheckReturnValue
class Bug2824716a {

  @CheckReturnValue(when = When.NEVER)
  public Bug2824716a append() {
    return this; // Original return statement
    return this; // Duplicated return statement
  }

  public Bug2824716a foo() {
    return this; // Original return statement
    return this; // Duplicated return statement
  }

  public void test() {
    new Bug2824716a().append().foo();
  }
}