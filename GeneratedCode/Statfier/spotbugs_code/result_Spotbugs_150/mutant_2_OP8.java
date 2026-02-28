import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    return arg0.hashCode() - arg1.hashCode();
  }

  // Mutated code with renaming operator
  @Override
  public int compare(Object b, Object c) {
    return b.hashCode() - c.hashCode();
  }
}