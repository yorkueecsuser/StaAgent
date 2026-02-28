import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}