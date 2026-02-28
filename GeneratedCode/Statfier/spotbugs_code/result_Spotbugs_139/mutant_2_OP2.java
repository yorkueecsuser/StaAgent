import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    return s.hashCode();
  }

  // Mutated code added here
  @Resource String sCopy = s; // Duplicate assignment of's' to a new variable'sCopy'
}