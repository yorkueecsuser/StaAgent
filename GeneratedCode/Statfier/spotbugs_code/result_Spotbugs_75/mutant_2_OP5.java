import java.util.Optional;

class MethodReferenceIndirect1 {
  int l, m, n;
  Optional<Integer> o;

  final int indirect() {
    return overridableMethod();
  }

  MethodReferenceIndirect1(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirect);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is always false
        l = 999;
        break;
      default:
        // Default case
        break;
    }
  }

  @Override
  public MethodReferenceIndirect1 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omc = (MethodReferenceIndirect1) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirect);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is always false
        omc.l = 999;
        break;
      default:
        // Default case
        break;
    }
    return omc;
  }

  int overridableMethod() {
    return 1;
  }

  private int privateMethod() {
    return 2;
  }

  final int finalMethod() {
    return 3;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}