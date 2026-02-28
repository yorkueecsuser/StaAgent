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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning(value = "GC,EC")
  public void test2(Set<String> s) {
    if (getIntegerSetPrivate().contains("x")) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @NoWarning(value = "GC,EC")
  public void test1OK(Set<Integer> s) {
    if (getIntegerSetPublic().contains(1)) s.removeAll(getIntegerSetPublic());
    if (s.equals(getIntegerSetPublic())) System.out.println("Equal");
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @NoWarning(value = "GC,EC")
  public void test2OK(Set<Integer> s) {
    if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
    if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  class Foo {

    @ExpectWarning(value = "GC,EC")
    public void test2(Set<String> s) {
      boolean b = getIntegerSetPrivate().contains("x");
      if (b) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This will also never run");
      }
    }

    @NoWarning(value = "GC,EC")
    public void test2OK(Set<Integer> s) {
      if (getIntegerSetPrivate().contains(1)) s.removeAll(getIntegerSetPrivate());
      if (s.equals(getIntegerSetPrivate())) System.out.println("Equal");
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This will also never run");
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}