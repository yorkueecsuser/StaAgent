import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    return s.hashCode();
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}