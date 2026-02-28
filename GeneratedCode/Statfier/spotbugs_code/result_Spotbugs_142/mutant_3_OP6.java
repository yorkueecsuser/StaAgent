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
    
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    return workingList.size();
  }

  // Method to provide a dynamic condition for the unreachable for loop
  private static boolean getConditionForLoop() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}