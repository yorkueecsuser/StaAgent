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

  // Mutated code starts here
  int a; // Renamed from l
  int b; // Renamed from m
  int c; // Renamed from n
  Optional<Integer> p; // Renamed from o

  MethodReferenceIndirect3(Optional<Integer> q) { // Renamed from opt
    p = q;
    a = p.orElseGet(this::indirectOverridable);
    b = p.orElseGet(this::indirectPrivate);
    c = p.orElseGet(this::indirectFinal);
  }

  @Override
  public MethodReferenceIndirect3 x() throws CloneNotSupportedException { // Renamed from clone
    MethodReferenceIndirect3 y = (MethodReferenceIndirect3) super.clone(); // Renamed from omc
    y.p = p;
    y.a = p.orElseGet(y::indirectOverridable);
    y.b = p.orElseGet(y::indirectPrivate);
    y.c = p.orElseGet(y::indirectFinal);
    return y;
  }

  int z() { // Renamed from overridableMethod
    return 1;
  }

  private int r() { // Renamed from privateMethod
    return 2;
  }

  final int s() { // Renamed from finalMethod
    return 3;
  }
}