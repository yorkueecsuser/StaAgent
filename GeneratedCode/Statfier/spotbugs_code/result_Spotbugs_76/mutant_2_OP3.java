import java.util.Optional;

class MethodReferenceIndirect2 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return 999; // Unique unreachable code
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return 888; // Unique unreachable code
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return 777; // Unique unreachable code
    }
    return o.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect2(Optional<Integer> opt) {
    o = opt;
    l = indirectOverridable();
    m = indirectPrivate();
    n = indirectFinal();
  }

  @Override
  public MethodReferenceIndirect2 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect2 omc = (MethodReferenceIndirect2) super.clone();
    omc.o = o;
    omc.l = omc.indirectOverridable();
    omc.m = omc.indirectPrivate();
    omc.n = omc.indirectFinal();
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
    return false; // This method ensures the condition is dynamically determined but always false
  }
}