import javax.annotation.Nullable;

class NoReuseUndefFunctionValues {

  Object mObject1;
  Object mObject2;

  native Object create();

  public NoReuseUndefFunctionValues(@Nullable Object object) {
    if (object!= null) {
      this.mObject1 = object;
      this.mObject1 = object; // Duplicate assignment
    } else {
      this.mObject1 = this.create();
    }
    if (object!= null) {
      this.mObject2 = object;
      this.mObject2 = object; // Duplicate assignment
    } else {
      this.mObject2 = this.create();
    }
  }
}