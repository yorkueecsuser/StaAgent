import java.util.Optional;

class MethodReferenceIndirect2 {
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

  MethodReferenceIndirect2(Optional<Integer> opt) {
    o = opt;
    l = indirectOverridable();
    l = indirectOverridable(); // Mutant: duplicated assignment
    m = indirectPrivate();
    m = indirectPrivate(); // Mutant: duplicated assignment
    n = indirectFinal();
    n = indirectFinal(); // Mutant: duplicated assignment
  }

  @Override
  public MethodReferenceIndirect2 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect2 omc = (MethodReferenceIndirect2) super.clone();
    omc.o = o;
    omc.l = omc.indirectOverridable();
    omc.l = omc.indirectOverridable(); // Mutant: duplicated assignment
    omc.m = omc.indirectPrivate();
    omc.m = omc.indirectPrivate(); // Mutant: duplicated assignment
    omc.n = omc.indirectFinal();
    omc.n = omc.indirectFinal(); // Mutant: duplicated assignment
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
}