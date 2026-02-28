import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
    return;
    if (actual.size() == expected.size()) // false positive NP warning (mutant)
    return;
    throw new AssertionError("Not the same");
  }
}