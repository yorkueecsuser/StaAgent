import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    return s.hashCode();
  }

  // Mutant code added according to the Duplication mutation operator
  @Resource String s; // Duplicate of the original field declaration
}