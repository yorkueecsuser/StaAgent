import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_16 {

  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object o) {
    if (o instanceof Integer) {
      return o.toString().equals(o);
    }
    if (Double.class.isInstance(o)) return false;
    if (o instanceof Float) return Float.class.cast(o).toString().equals(this.toString());
    return false;
  }

  // Mutated code
  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object x) {
    if (x instanceof Integer) {
      return x.toString().equals(x);
    }
    if (Double.class.isInstance(x)) return false;
    if (x instanceof Float) return Float.class.cast(x).toString().equals(this.toString());
    return false;
  }
}