import javax.annotation.Nullable;

class NoReuseUndefFunctionValues {

  Object mObject1;
  Object mObject2;

  native Object create();

  public NoReuseUndefFunctionValues(@Nullable Object object) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

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
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but dynamically determined
  }
}