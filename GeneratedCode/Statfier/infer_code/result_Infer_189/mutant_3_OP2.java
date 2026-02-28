import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {
    // Original assignment statement
    this.field = object;
    // Duplicated assignment statement
    this.field = object;
  }
}