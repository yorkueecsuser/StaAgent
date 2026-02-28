import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    // Dead store mutation
    String jxqftrbz = "unusedVariable";
    
    return arg0.hashCode() - arg1.hashCode();
  }
}