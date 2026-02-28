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

  // Mutated code starts here
  int x; // Renamed 'l' to 'x'
  int y; // Renamed'm' to 'y'
  int z; // Renamed 'n' to 'z'
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

  MethodReferenceIndirect2(Optional<Integer> pt) {
    p = pt;
    x = indirectOverridableMutant();
    y = indirectPrivateMutant();
    z = indirectFinalMutant();
  }

  @Override
  public MethodReferenceIndirect2 cloneMutant() throws CloneNotSupportedException {
    MethodReferenceIndirect2 omc = (MethodReferenceIndirect2) super.clone();
    omc.p = p;
    omc.x = omc.indirectOverridableMutant();
    omc.y = omc.indirectPrivateMutant();
    omc.z = omc.indirectFinalMutant();
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