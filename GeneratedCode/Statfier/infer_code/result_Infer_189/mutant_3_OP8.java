import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {}

  // Mutated code
  public Object afield; // Renamed 'field' to 'afield'

  public Object aexternalMethod1() {
    return null;
  }

  public void aexternalMethod2(@Nullable Object aobject) {} // Renamed 'object' to 'aobject'
}