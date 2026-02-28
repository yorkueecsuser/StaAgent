import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Original code starts
    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
    // Original code ends

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      return true;
    } else {
      // This block is also unreachable for the same reason
      return false;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}