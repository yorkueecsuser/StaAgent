import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    // Introduced an unreachable if-else statement with a dynamic condition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }

    return s.hashCode();
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}