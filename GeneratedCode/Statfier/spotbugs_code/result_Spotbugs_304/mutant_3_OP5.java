public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        System.out.println("This is also unreachable code.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}