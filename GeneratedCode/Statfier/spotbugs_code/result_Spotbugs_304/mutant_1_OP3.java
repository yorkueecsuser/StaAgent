public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return foo + bar;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);

  private boolean getCondition() {
    // This method returns false, making the if statement unreachable
    return false;
  }
}