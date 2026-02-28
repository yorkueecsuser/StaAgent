import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Introduced an unreachable if statement using a non-final variable
    boolean condition = getCondition();
    if (condition) {
      return false; // This branch is unreachable because getCondition() always returns false
    }

    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Method to provide a dynamically determined condition that always returns false
  private boolean getCondition() {
    return false;
  }
}