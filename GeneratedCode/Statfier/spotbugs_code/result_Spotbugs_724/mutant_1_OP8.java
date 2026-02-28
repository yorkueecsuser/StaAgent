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

  // Mutated code with renaming of variable 'o' to 'a'
  @Override
  @ExpectWarning("Eq")
  public boolean equals(Object a) {
    if (a instanceof Integer) {
      return a.toString().equals(a);
    }
    if (Double.class.isInstance(a)) return false;
    if (a instanceof Float) return Float.class.cast(a).toString().equals(this.toString());
    return false;
  }
}