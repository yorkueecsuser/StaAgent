import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Introducing an unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }

    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}