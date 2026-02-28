import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Mutated code
  ArrayList<Integer> xst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] bArray() {
    return (Integer[]) xst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean zquals(Object o) {
    return xst.equals(((BadDowncastOfToArray) o).xst);
  }
}