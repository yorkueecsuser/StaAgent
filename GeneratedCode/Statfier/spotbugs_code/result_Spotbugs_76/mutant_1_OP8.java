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

  // Mutated code
  int a; // Renamed from l
  int b; // Renamed from m
  int c; // Renamed from n
  Optional<Integer> p; // Renamed from o

  final int indirectOverridableMutant() {
    return p.orElseGet(this::overridableMethod);
  }

  final int indirectPrivateMutant() {
    return p.orElseGet(this::privateMethod);
  }

  final int indirectFinalMutant() {
    return p.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect2(Optional<Integer> q) { // Renamed from opt
    p = q;
    a = indirectOverridableMutant();
    b = indirectPrivateMutant();
    c = indirectFinalMutant();
  }

  @Override
  public MethodReferenceIndirect2 cloneMutant() throws CloneNotSupportedException {
    MethodReferenceIndirect2 rmc = (MethodReferenceIndirect2) super.clone(); // Renamed from omc
    rmc.p = p;
    rmc.a = rmc.indirectOverridableMutant();
    rmc.b = rmc.indirectPrivateMutant();
    rmc.c = rmc.indirectFinalMutant();
    return rmc;
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