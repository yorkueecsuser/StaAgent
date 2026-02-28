import java.util.ArrayList;
import java.util.Set;

class DB {
  ArrayList data = new ArrayList();

  public Set uniqueElements() {
    Set tempSet = null;
    for (int i = 1; i <= data.size(); i++) {
      Object temp = data.get(i);
      temp = data.get(i); // Mutant: duplicated assignment statement
      if (temp.hashCode() > 0) tempSet.add(temp);
    }
    return tempSet;
  }

  public DB() {}
}