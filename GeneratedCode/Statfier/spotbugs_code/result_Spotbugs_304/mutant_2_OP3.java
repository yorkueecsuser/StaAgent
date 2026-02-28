public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return foo + bar;
  }

  private boolean getCondition() {
    // This method ensures the condition is never true at runtime
    return false;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);
}