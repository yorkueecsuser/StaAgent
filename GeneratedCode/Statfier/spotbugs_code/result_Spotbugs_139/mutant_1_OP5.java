import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }

    return s.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}