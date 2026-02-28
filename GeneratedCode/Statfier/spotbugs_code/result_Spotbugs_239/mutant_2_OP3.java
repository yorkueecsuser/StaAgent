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
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning(value = "GC,EC")
  public void test2(Set<String> s) {
    if (getIntegerSetPrivate().contains("x")) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  @NoWarning(value = "GC,EC")
  public void test1OK(Set<Integer> s) {
    if (getIntegerSetPublic().contains(1)) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
  }

  @NoWarning(value = "GC,EC")
  public void test2OK(Set<Integer> s) {
    if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("And yet another unreachable statement");
    }
  }

  class Foo {

    @ExpectWarning(value = "GC,EC")
    public void test2(Set<String> s) {
      boolean b = getIntegerSetPrivate().contains("x");
      if (b) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Unreachable statement inside Foo");
      }
    }

    @NoWarning(value = "GC,EC")
    public void test2OK(Set<Integer> s) {
      if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Another unreachable statement inside Foo");
      }
    }
  }

  // Method to provide a dynamic condition for unreachable if statements
  private boolean getCondition() {
    return false;
  }
}