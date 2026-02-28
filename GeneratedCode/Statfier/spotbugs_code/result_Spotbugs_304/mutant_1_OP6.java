public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);

  // Inserting an unreachable for loop
  public boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
  }
}