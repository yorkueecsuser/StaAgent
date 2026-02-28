import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -1; // This will never be executed
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -2; // This will never be executed
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -3; // This will never be executed
    }
    return o.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect3(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirectOverridable);
    m = o.orElseGet(this::indirectPrivate);
    n = o.orElseGet(this::indirectFinal);
  }

  @Override
  public MethodReferenceIndirect3 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.o = o;
    boolean conditionClone = getCondition();
    if (conditionClone) { // Unreachable if statement
      omc.l = -4; // This will never be executed
    } else {
      omc.l = o.orElseGet(omc::indirectOverridable);
    }
    omc.m = o.orElseGet(omc::indirectPrivate);
    omc.n = o.orElseGet(omc::indirectFinal);
    return omc;
  }

  int overridableMethod() {
    boolean conditionMethod = getCondition();
    if (conditionMethod) { // Unreachable if statement
      return -5; // This will never be executed
    }
    return 1;
  }

  private int privateMethod() {
    boolean conditionPrivate = getCondition();
    if (conditionPrivate) { // Unreachable if statement
      return -6; // This will never be executed
    }
    return 2;
  }

  final int finalMethod() {
    boolean conditionFinal = getCondition();
    if (conditionFinal) { // Unreachable if statement
      return -7; // This will never be executed
    }
    return 3;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}