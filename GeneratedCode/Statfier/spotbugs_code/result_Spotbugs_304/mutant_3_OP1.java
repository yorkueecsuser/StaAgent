public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
    // Dead Store Mutation
    int abcdefgh = 42; // Unused variable declaration
  }

  public int foo, bar;

  public abstract int compareTo(Hashcode c);
}