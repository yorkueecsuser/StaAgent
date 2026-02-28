import java.util.Optional;

class MethodReferenceIndirect2 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return 1;
  }

  private int privateMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return 2;
  }

  final int finalMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return 3;
  }

  private boolean getCondition() {
    return false;
  }
}