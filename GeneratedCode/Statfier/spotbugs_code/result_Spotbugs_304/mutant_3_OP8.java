public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
  }

  public int foo, bar;

  // Mutated variable names
  public int a, b;

  public abstract int compareTo(Hashcode c);
}