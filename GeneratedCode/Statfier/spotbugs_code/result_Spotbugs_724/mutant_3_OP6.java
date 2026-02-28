import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}