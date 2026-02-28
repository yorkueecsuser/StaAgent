import java.util.ArrayList;
import java.util.Set;

class DB {
  ArrayList data = new ArrayList();

  public Set uniqueElements() {
    Set tempSet = null;
    for (int i = 1; i <= data.size(); i++) {
      Object temp = data.get(i);
      if (temp.hashCode() > 0) tempSet.add(temp);

      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        tempSet.clear();
      } else {
        // This block will always execute
        tempSet = new java.util.HashSet();
      }
    }
    return tempSet;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }

  public DB() {}
}