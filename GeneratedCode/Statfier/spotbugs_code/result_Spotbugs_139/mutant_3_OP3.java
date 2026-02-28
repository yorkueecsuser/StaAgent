import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    // Introducing an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}