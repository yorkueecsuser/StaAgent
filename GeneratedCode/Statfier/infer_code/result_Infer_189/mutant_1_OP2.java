import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public SomeExternalClass() {
    this.field = new Object(); // Original assignment
    this.field = new Object(); // Duplicated assignment
  }

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}
}