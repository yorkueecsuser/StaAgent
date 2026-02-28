import javax.annotation.Nullable;

class NoReuseUndefFunctionValues {

  Object mObject1;
  Object mObject2;

  native Object create();

  public NoReuseUndefFunctionValues(@Nullable Object object) {
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
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

  private boolean getConditionForLoop() {
    return false; // This method ensures the condition is dynamically determined but returns false to keep the loop unreachable
  }
}