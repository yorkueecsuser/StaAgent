import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Dead store mutation
    String qvbnrhty = "unusedVariable";
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Dead store mutation
    int xjflkzcv = 42;
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }
}