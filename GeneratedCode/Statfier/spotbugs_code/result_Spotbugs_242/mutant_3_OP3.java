import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in asArray method.");
    }
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in equals method.");
    }
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}