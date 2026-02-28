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
    l = o.orElseGet(this::indirectOverridable); // Mutant: duplicated assignment
    m = o.orElseGet(this::indirectPrivate);
    m = o.orElseGet(this::indirectPrivate); // Mutant: duplicated assignment
    n = o.orElseGet(this::indirectFinal);
    n = o.orElseGet(this::indirectFinal); // Mutant: duplicated assignment
  }

  @Override
  public MethodReferenceIndirect3 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirectOverridable);
    omc.l = o.orElseGet(omc::indirectOverridable); // Mutant: duplicated assignment
    omc.m = o.orElseGet(omc::indirectPrivate);
    omc.m = o.orElseGet(omc::indirectPrivate); // Mutant: duplicated assignment
    omc.n = o.orElseGet(omc::indirectFinal);
    omc.n = o.orElseGet(omc::indirectFinal); // Mutant: duplicated assignment
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