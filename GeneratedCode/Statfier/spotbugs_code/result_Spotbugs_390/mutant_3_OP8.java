import java.util.List;

class Bug1844673 {

  public void falsePositive(List actual, List expected) {
    if (actual == expected) return;

    if ((actual == null && expected!= null) || (actual!= null && expected == null)) {
      return;
    }

    if (actual.size() == expected.size()) // false positive NP warning
    return;
    throw new AssertionError("Not the same");

    // Mutant code
    List b = actual; // Renamed 'actual' to 'b'
    List c = expected; // Renamed 'expected' to 'c'
    if (b == c) return;

    if ((b == null && c!= null) || (b!= null && c == null)) {
      return;
    }

    if (b.size() == c.size()) // false positive NP warning
    return;
    throw new AssertionError("Not the same");
  }
}