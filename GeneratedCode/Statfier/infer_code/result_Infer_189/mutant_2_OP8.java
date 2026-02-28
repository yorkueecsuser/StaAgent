import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Mutated code
  public Object a() {
    return null;
  }

  public void b(@Nullable Object c) {}
}