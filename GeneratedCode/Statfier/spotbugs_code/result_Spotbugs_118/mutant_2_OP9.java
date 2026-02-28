import java.util.ArrayList;
import java.util.Set;

class DB {
  ArrayList data = new ArrayList();

  public Set uniqueElements() {
    Set tempSet = null;
    int i = 1;
    do {
      Object temp = data.get(i);
      if (temp.hashCode() > 0) tempSet.add(temp);
      i++;
    } while (i <= data.size());
    return tempSet;
  }

  public DB() {}
}