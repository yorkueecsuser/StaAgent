import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}