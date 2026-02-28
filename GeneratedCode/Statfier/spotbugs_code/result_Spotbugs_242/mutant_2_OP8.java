import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class BadDowncastOfToArray {

  ArrayList<Integer> lst = new ArrayList<Integer>();
  ArrayList<Integer> x = new ArrayList<Integer>(); // New variable for mutation

  @ExpectWarning("BC")
  public Integer[] asArray() {
    return (Integer[]) lst.toArray();
  }

  @Override
  @ExpectWarning("BC")
  public boolean equals(Object o) {
    return lst.equals(((BadDowncastOfToArray) o).lst);
  }

  // Mutated method with renamed variable
  @ExpectWarning("BC")
  public Integer[] asArrayMutated() {
    return (Integer[]) x.toArray(); // Using new variable 'x' for mutation
  }

  @Override
  @ExpectWarning("BC")
  public boolean equalsMutated(Object o) {
    return x.equals(((BadDowncastOfToArray) o).x); // Using new variable 'x' for mutation
  }
}