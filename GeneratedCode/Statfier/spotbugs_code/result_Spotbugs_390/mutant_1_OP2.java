import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;
    if (actual == expected) return; // Mutant: Duplicate of the previous condition

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }
    if ((actual == null && expected!= null) || (actual!= null && expected == null)) { // Mutant: Duplicate of the previous condition
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
    return;
    if (actual.size() == expected.size()) // Mutant: Duplicate of the previous condition
    return;
    throw new AssertionError("Not the same");
  }
}