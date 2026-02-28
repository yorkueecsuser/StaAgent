import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    l = o.orElseGet(this::overridableMethod); // Duplicate assignment for l
    m = o.orElseGet(this::privateMethod);
    m = o.orElseGet(this::privateMethod); // Duplicate assignment for m
    n = o.orElseGet(this::finalMethod);
    n = o.orElseGet(this::finalMethod); // Duplicate assignment for n
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.l = o.orElseGet(omc::overridableMethod); // Duplicate assignment for omc.l
    omc.m = o.orElseGet(omc::privateMethod);
    omc.m = o.orElseGet(omc::privateMethod); // Duplicate assignment for omc.m
    omc.n = o.orElseGet(omc::finalMethod);
    omc.n = o.orElseGet(omc::finalMethod); // Duplicate assignment for omc.n
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