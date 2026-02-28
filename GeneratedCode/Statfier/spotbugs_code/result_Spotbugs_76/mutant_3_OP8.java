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

  MethodReferenceIndirect2(Optional<Integer> x) { // Renamed from opt
    p = x;
    a = indirectOverridable();
    b = indirectPrivate();
    c = indirectFinal();
  }

  @Override
  public MethodReferenceIndirect2 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect2 y = (MethodReferenceIndirect2) super.clone(); // Renamed from omc
    y.p = p;
    y.a = y.indirectOverridable();
    y.b = y.indirectPrivate();
    y.c = y.indirectFinal();
    return y;
  }
}