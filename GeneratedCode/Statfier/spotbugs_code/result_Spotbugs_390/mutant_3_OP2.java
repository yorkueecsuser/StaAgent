import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;
    if (actual == expected) return; // Duplicate of the previous line

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }
    if ((actual == null && expected!= null) || (actual!= null && expected == null)) { // Duplicate of the previous block
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
      return;
    if (actual.size() == expected.size()) // Duplicate of the previous line
      return;
    throw new AssertionError("Not the same");
  }
}