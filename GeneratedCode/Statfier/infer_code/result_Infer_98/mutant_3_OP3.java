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

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      this.mObject1 = new Object(); // This branch is unreachable
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}