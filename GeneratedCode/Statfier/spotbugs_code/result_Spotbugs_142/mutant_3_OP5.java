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
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition? 0 : 1 will always be 1
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
    
    return workingList.size();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return different values at runtime
  }
}