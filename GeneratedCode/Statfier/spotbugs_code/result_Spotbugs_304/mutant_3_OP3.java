public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      foo = 0; // Example operation that would be unreachable
    }
    return foo + bar;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}