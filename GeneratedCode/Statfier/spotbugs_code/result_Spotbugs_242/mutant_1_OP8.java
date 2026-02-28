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
  ArrayList<Integer> x = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] b() {
    return (Integer[]) x.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean c(Object y) {
    return x.equals(((BadDowncastOfToArray) y).x);
  }
}