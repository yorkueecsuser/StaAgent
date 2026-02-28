import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Mutated variable names
    int x = o.orElseGet(this::overridableMethod);
    int y = o.orElseGet(this::privateMethod);
    int z = o.orElseGet(this::finalMethod);
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);
    return omc;

    // Mutated variable names
    int a = o.orElseGet(omc::overridableMethod);
    int b = o.orElseGet(omc::privateMethod);
    int c = o.orElseGet(omc::finalMethod);
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