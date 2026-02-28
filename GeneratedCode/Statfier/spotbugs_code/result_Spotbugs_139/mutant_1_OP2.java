import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    return s.hashCode();
  }

  // Mutant code added here
  @Resource String sCopy = s; // Duplicate assignment statement
}