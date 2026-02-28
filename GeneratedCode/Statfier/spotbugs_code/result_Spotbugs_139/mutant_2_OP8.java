import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;
  @Resource String x; // Mutated variable

  @Override
  public int hashCode() {
    return s.hashCode(); // Original code remains unchanged
  }

  public int mutatedHashCode() {
    return x.hashCode(); // Mutated method using new variable
  }
}