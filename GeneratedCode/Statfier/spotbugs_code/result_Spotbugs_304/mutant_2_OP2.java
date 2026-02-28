public abstract class Hashcode implements Comparable {

  @Override
  public int hashCode() {
    return foo + bar;
  }

  public int foo, bar;
  public int fooDuplicate = foo; // Added duplicate assignment for foo

  public abstract int compareTo(Hashcode c);
}