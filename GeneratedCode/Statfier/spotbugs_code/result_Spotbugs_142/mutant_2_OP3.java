import java.util.ArrayList;
import java.util.Iterator;

/*Consider the following block of code:

1: List workingList = (List)getList().clone();
2: Iterator iter = workingList!= null?
workingList.iterator() : null;
3: for (int i = 0; i < workingList.size(); i++) {


FindBugs 1.1 gives a NP message for line 3. Instead, it
should give RCN for line 2 since a clone operation
could never return a null value.
*/
class Bug1563719 {

  public static int f(ArrayList list) {
    ArrayList workingList = (ArrayList) list.clone();
    Iterator iter = workingList!= null? workingList.iterator() : null;

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      workingList.add(new Object());
    }

    return workingList.size();
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}