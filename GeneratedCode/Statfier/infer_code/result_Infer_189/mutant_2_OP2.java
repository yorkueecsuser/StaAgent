import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    Object localVar = new Object(); // Hypothetical assignment statement
    Object localVar = new Object(); // Duplicated assignment statement
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}
}