import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();
  ArrayList<Integer> lstCopy = new ArrayList<Integer>(); // Added duplicate assignment

  @ExpectWarning("BC")
  public Integer[] asArray() {
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }
}