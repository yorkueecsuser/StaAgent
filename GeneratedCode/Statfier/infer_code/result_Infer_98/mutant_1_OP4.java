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

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      this.mObject1 = new Object(); // This branch is intended to be unreachable
    } else {
      this.mObject2 = new Object(); // This branch is also intended to be unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}