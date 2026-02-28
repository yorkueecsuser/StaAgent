import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    int hashDiff = arg0.hashCode() - arg1.hashCode();
    int hashDiff = arg0.hashCode() - arg1.hashCode(); // Duplicate of the assignment statement
    return hashDiff;
  }
}