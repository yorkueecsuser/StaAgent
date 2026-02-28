import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in indirectOverridable");
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in indirectPrivate");
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in indirectFinal");
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
      System.out.println("This is an unreachable if statement in clone");
    }
    omc.l = o.orElseGet(omc::indirectOverridable);
    omc.m = o.orElseGet(omc::indirectPrivate);
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
    return false; // This method always returns false, making the if statements unreachable
  }
}