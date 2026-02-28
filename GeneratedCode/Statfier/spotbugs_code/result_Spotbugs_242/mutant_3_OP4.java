import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }
    return (Integer[]) lst.toArray();
  }

  private boolean getCondition() {
    // Always return false to ensure the if block is unreachable
    return false;
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block in equals method");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block in equals method");
    }
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }
}