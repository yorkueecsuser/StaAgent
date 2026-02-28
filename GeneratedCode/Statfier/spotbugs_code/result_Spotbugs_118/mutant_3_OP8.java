import java.util.ArrayList;
import java.util.Set;

class DB {
  ArrayList data = new ArrayList();

  public Set uniqueElements() {
    Set tempSet = null;
    for (int i = 1; i <= data.size(); i++) {
      Object temp = data.get(i);
      if (temp.hashCode() > 0) tempSet.add(temp);
    }
    return tempSet;
  }

  // Mutated code with renaming operator
  public Set uniqueElementsMutant() {
    Set z = null;
    for (int j = 1; j <= data.size(); j++) {
      Object x = data.get(j);
      if (x.hashCode() > 0) z.add(x);
    }
    return z;
  }

  public DB() {}
}