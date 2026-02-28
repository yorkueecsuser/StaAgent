class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        t = null;
        break;
      default:
        // Default case to ensure switch is not empty and reachable
        break;
    }
    return t == null? null : t;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}