import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Mutated code
  public Object xternalMethod1() {
    return null;
  }

  public void xternalMethod2(@Nullable Object xbject) {}
}