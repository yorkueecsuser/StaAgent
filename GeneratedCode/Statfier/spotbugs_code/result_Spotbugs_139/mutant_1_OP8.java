import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;
  @Resource String t; // Added for mutation

  @Override
  public int hashCode() {
    return s.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass()!= obj.getClass()) return false;
    Ejb3Fields that = (Ejb3Fields) obj;
    return t.equals(that.t); // Mutated line using new variable 't'
  }
}