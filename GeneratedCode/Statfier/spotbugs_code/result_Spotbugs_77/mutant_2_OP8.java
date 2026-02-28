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
  int a; // Renamed 'l' to 'a'
  int b; // Renamed'm' to 'b'
  int c; // Renamed 'n' to 'c'
  Optional<Integer> p; // Renamed 'o' to 'p'

  final int indirectOverridableMutant() {
    return p.orElseGet(this::overridableMethod);
  }

  final int indirectPrivateMutant() {
    return p.orElseGet(this::privateMethod);
  }

  final int indirectFinalMutant() {
    return p.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect3(Optional<Integer> pr) {
    p = pr;
    a = p.orElseGet(this::indirectOverridableMutant);
    b = p.orElseGet(this::indirectPrivateMutant);
    c = p.orElseGet(this::indirectFinalMutant);
  }

  @Override
  public MethodReferenceIndirect3 cloneMutant() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.p = p;
    omc.a = p.orElseGet(omc::indirectOverridableMutant);
    omc.b = p.orElseGet(omc::indirectPrivateMutant);
    omc.c = p.orElseGet(omc::indirectFinalMutant);
    return omc;
  }

  int overridableMethodMutant() {
    return 1;
  }

  private int privateMethodMutant() {
    return 2;
  }

  final int finalMethodMutant() {
    return 3;
  }
}