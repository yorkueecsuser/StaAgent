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

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      this.mObject1 = new Object(); // This will never be executed
    } else {
      this.mObject2 = new Object(); // This will also never be executed
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else unreachable
  }
}