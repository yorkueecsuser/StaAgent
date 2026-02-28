public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return foo + bar;
  }

  private boolean getCondition() {
    return false;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);
}