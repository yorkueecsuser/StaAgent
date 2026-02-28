import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -1;
    } else {
      // Unreachable code
      return -2;
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -3;
    } else {
      // Unreachable code
      return -4;
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -5;
    } else {
      // Unreachable code
      return -6;
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
    if (conditionClone) {
      // Unreachable code
      omc.l = -7;
    } else {
      // Unreachable code
      omc.l = -8;
    }
    omc.l = o.orElseGet(omc::indirectOverridable);

    conditionClone = getCondition();
    if (conditionClone) {
      // Unreachable code
      omc.m = -9;
    } else {
      // Unreachable code
      omc.m = -10;
    }
    omc.m = o.orElseGet(omc::indirectPrivate);

    conditionClone = getCondition();
    if (conditionClone) {
      // Unreachable code
      omc.n = -11;
    } else {
      // Unreachable code
      omc.n = -12;
    }
    omc.n = o.orElseGet(omc::indirectFinal);
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

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if-else branches are unreachable
  }
}