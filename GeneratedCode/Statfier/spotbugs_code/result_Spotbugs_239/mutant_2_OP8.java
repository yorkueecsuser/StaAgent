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
    return getIntegerSetPublic().contains("x");
  }

  @ExpectWarning(value = "GC")
  public boolean test2a(Set<String> s) {
    return getIntegerSetPrivate().contains("x");
  }

  @ExpectWarning(value = "GC,EC")
  public void test1(Set<String> s) {
    if (getIntegerSetPublic().contains("x")) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
  }

  @ExpectWarning(value = "GC,EC")
  public void test2(Set<String> s) {
    if (getIntegerSetPrivate().contains("x")) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test1OK(Set<Integer> s) {
    if (getIntegerSetPublic().contains(1)) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test2OK(Set<Integer> s) {
    if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
  }

  class Foo {

    @ExpectWarning(value = "GC,EC")
    public void test2(Set<String> s) {
      boolean b = getIntegerSetPrivate().contains("x");
      if (b) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    }

    @NoWarning(value = "GC,EC")
    public void test2OK(Set<Integer> s) {
      if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    }
  }

  // Mutated code
  Set<Integer> t = new HashSet<Integer>();

  public Set<Integer> getIntegerSetPublicMutated() {
    return t;
  }

  private Set<Integer> getIntegerSetPrivateMutated() {
    return t;
  }

  @ExpectWarning(value = "GC")
  public boolean test1aMutated(Set<String> a) {
    return getIntegerSetPublicMutated().contains("x");
  }

  @ExpectWarning(value = "GC")
  public boolean test2aMutated(Set<String> a) {
    return getIntegerSetPrivateMutated().contains("x");
  }

  @ExpectWarning(value = "GC,EC")
  public void test1Mutated(Set<String> a) {
    if (getIntegerSetPublicMutated().contains("x")) a.removeAll(getIntegerSetPublicMutated());
    if (a.equals(getIntegerSetPublicMutated())) System.out.println("Equal");
  }

  @ExpectWarning(value = "GC,EC")
  public void test2Mutated(Set<String> a) {
    if (getIntegerSetPrivateMutated().contains("x")) a.removeAll(getIntegerSetPrivateMutated());
    if (a.equals(getIntegerSetPrivateMutated())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test1OKMutated(Set<Integer> a) {
    if (getIntegerSetPublicMutated().contains(1)) a.removeAll(getIntegerSetPublicMutated());
    if (a.equals(getIntegerSetPublicMutated())) System.out.println("Equal");
  }

  @NoWarning(value = "GC,EC")
  public void test2OKMutated(Set<Integer> a) {
    if (getIntegerSetPrivateMutated().contains(1)) a.removeAll(getIntegerSetPrivateMutated());
    if (a.equals(getIntegerSetPrivateMutated())) System.out.println("Equal");
  }

  class Bar {

    @ExpectWarning(value = "GC,EC")
    public void test2Mutated(Set<String> a) {
      boolean c = getIntegerSetPrivateMutated().contains("x");
      if (c) a.removeAll(getIntegerSetPrivateMutated());
      if (a.equals(getIntegerSetPrivateMutated())) System.out.println("Equal");
    }

    @NoWarning(value = "GC,EC")
    public void test2OKMutated(Set<Integer> a) {
      if (getIntegerSetPrivateMutated().contains(1)) a.removeAll(getIntegerSetPrivateMutated());
      if (a.equals(getIntegerSetPrivateMutated())) System.out.println("Equal");
    }
  }
}