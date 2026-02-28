import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    return s.hashCode();
  }

  // Mutant code
  @Resource String t;
}