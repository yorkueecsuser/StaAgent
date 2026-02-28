import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable case");
        break;
    }
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable case");
        break;
    }
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}