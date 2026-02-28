import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    return o.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect3(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirectOverridable);
    m = o.orElseGet(this::indirectPrivate);
    n = o.orElseGet(this::indirectFinal);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        l = 999;
        break;
      case false:
        // This case will never be reached because getCondition() does not return false
        m = 888;
        break;
    }
  }

  @Override
  public MethodReferenceIndirect3 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirectOverridable);
    omc.m = o.orElseGet(omc::indirectPrivate);
    omc.n = o.orElseGet(omc::indirectFinal);

    // Inserting unreachable switch statement
    boolean conditionClone = getCondition();
    switch(conditionClone) {
      case true:
        // This case will never be reached because getCondition() does not return true
        omc.l = 777;
        break;
      case false:
        // This case will never be reached because getCondition() does not return false
        omc.m = 666;
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

  // Method to provide a dynamic condition that ensures the switch statement is unreachable
  private boolean getCondition() {
    return Math.random() > 1.0; // This will always be false
  }
}