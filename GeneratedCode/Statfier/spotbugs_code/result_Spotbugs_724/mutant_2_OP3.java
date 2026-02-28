import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    // Unreachable if statement added
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}