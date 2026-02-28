import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2011_07_31 {

  Set<Integer> s = new HashSet<Integer>();

  public Set<Integer> getIntegerSetPublic() {
    return s;
  }

  private Set<Integer> getIntegerSetPrivate() {
    return s;
  }

  @ExpectWarning(value = "GC")
  public boolean test1a(Set<String> s) {
    String unusedVar1 = "abcdefgh"; // Dead Store
    return getIntegerSetPublic().contains("x");
  }

  @ExpectWarning(value = "GC")
  public boolean test2a(Set<String> s) {
    int unusedVar2 = 12345678; // Dead Store
    return getIntegerSetPrivate().contains("x");
  }

  @ExpectWarning(value = "GC,EC")
  public void test1(Set<String> s) {
    double unusedVar3 = 98765432.1; // Dead Store
    if (getIntegerSetPublic().contains("x")) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
  }

  @ExpectWarning(value = "GC,EC")
  public void test2(Set<String> s) {
    char unusedVar4 = 'a'; // Dead Store
    if (getIntegerSetPrivate().contains("x")) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test1OK(Set<Integer> s) {
    float unusedVar5 = 3.141592f; // Dead Store
    if (getIntegerSetPublic().contains(1)) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test2OK(Set<Integer> s) {
    long unusedVar6 = 9876543210L; // Dead Store
    if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
  }

  class Foo {

    @ExpectWarning(value = "GC,EC")
    public void test2(Set<String> s) {
      boolean b = getIntegerSetPrivate().contains("x");
      byte unusedVar7 = -128; // Dead Store
      if (b) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    }

    @NoWarning(value = "GC,EC")
    public void test2OK(Set<Integer> s) {
      short unusedVar8 = 32767; // Dead Store
      if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    }
  }
}