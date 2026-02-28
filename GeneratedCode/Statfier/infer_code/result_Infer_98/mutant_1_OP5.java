import javax.annotation.Nullable;

class NoReuseUndefFunctionValues {

  Object mObject1;
  Object mObject2;

  native Object create();

  public NoReuseUndefFunctionValues(@Nullable Object object) {
    if (object!= null) {
      this.mObject1 = object;
    } else {
      this.mObject1 = this.create();
    }
    if (object!= null) {
      this.mObject2 = object;
    } else {
      this.mObject2 = this.create();
    }

    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be reached because unreachableCondition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to avoid unreachable statement error
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}