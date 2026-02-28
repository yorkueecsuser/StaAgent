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

    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }

    return workingList.size();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}