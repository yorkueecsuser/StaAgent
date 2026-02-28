import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return true;
    }

    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}