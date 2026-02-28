public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return foo + bar;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);

  private boolean getCondition() {
    return false;
  }
}