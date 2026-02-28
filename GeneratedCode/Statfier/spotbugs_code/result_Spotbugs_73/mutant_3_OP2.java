import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    l = o.orElseGet(this::overridableMethod); // Mutant: duplicated assignment
    m = o.orElseGet(this::privateMethod);
    m = o.orElseGet(this::privateMethod); // Mutant: duplicated assignment
    n = o.orElseGet(this::finalMethod);
    n = o.orElseGet(this::finalMethod); // Mutant: duplicated assignment
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.l = o.orElseGet(omc::overridableMethod); // Mutant: duplicated assignment
    omc.m = o.orElseGet(omc::privateMethod);
    omc.m = o.orElseGet(omc::privateMethod); // Mutant: duplicated assignment
    omc.n = o.orElseGet(omc::finalMethod);
    omc.n = o.orElseGet(omc::finalMethod); // Mutant: duplicated assignment
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