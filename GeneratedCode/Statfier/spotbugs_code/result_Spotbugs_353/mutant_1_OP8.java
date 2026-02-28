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
  }

  // Mutated code
  @CheckReturnValue
  class z {

    @CheckReturnValue(when = When.NEVER)
    public z append() {
      return this;
    }

    public z foo() {
      return this;
    }

    public void q() {
      new z().append().foo();
    }
  }
}