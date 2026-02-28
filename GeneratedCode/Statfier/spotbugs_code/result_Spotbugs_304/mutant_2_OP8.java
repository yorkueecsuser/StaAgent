public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
  }

  public int foo, bar;

  // Mutant: Renaming 'foo' to 'x'
  public int x = foo;

  // Mutant: Renaming 'bar' to 'y'
  public int y = bar;

  public abstract int compareTo(Hashcode c);
}