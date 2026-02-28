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

  public DB() {}

  // Mutated code with renaming operator
  public Set uniqueElementsMutant() {
    Set b = null;
    for (int j = 1; j <= data.size(); j++) {
      Object c = data.get(j);
      if (c.hashCode() > 0) b.add(c);
    }
    return b;
  }
}