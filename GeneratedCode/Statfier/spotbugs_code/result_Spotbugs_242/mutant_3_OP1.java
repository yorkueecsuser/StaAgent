import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();

  @ExpectWarning("BC")
  public Integer[] asArray() {
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    // Dead Store Mutation
    int ijklmnop = 12345678;
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }
}