import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because there's no way to reach the else part
      System.out.println("This is an unreachable else block");
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}