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
  }

  @Override
  public MethodReferenceIndirect3 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.o = o;
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

  // Mutated code
  int x, y, z;
  Optional<Integer> p;

  final int mutatedIndirectOverridable() {
    return p.orElseGet(this::mutatedOverridableMethod);
  }

  final int mutatedIndirectPrivate() {
    return p.orElseGet(this::mutatedPrivateMethod);
  }

  final int mutatedIndirectFinal() {
    return p.orElseGet(this::mutatedFinalMethod);
  }

  MethodReferenceIndirect3(Optional<Integer> pr) {
    p = pr;
    x = p.orElseGet(this::mutatedIndirectOverridable);
    y = p.orElseGet(this::mutatedIndirectPrivate);
    z = p.orElseGet(this::mutatedIndirectFinal);
  }

  @Override
  public MethodReferenceIndirect3 mutatedClone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.p = p;
    omc.x = p.orElseGet(omc::mutatedIndirectOverridable);
    omc.y = p.orElseGet(omc::mutatedIndirectPrivate);
    omc.z = p.orElseGet(omc::mutatedIndirectFinal);
    return omc;
  }

  int mutatedOverridableMethod() {
    return 1;
  }

  private int mutatedPrivateMethod() {
    return 2;
  }

  final int mutatedFinalMethod() {
    return 3;
  }
}