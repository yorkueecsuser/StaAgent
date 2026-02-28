import java.util.Optional;

class MethodReferenceIndirect1 {
  int l, m, n;
  Optional<Integer> o;

  final int indirect() {
    return overridableMethod();
  }

  MethodReferenceIndirect1(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirect);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);
  }

  @Override
  public MethodReferenceIndirect1 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omc = (MethodReferenceIndirect1) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirect);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);
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

  final int indirectx() {
    return overridableMethodx();
  }

  MethodReferenceIndirect1(Optional<Integer> px) {
    p = px;
    x = p.orElseGet(this::indirectx);
    y = p.orElseGet(this::privateMethodx);
    z = p.orElseGet(this::finalMethodx);
  }

  @Override
  public MethodReferenceIndirect1 clonex() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omcx = (MethodReferenceIndirect1) super.clone();
    omcx.p = p;
    omcx.x = p.orElseGet(omcx::indirectx);
    omcx.y = p.orElseGet(omcx::privateMethodx);
    omcx.z = p.orElseGet(omcx::finalMethodx);
    return omcx;
  }

  int overridableMethodx() {
    return 1;
  }

  private int privateMethodx() {
    return 2;
  }

  final int finalMethodx() {
    return 3;
  }
}