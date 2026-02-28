import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);
    
    // Mutant code
    int a = o.orElseGet(this::overridableMethod);
    int b = o.orElseGet(this::privateMethod);
    int c = o.orElseGet(this::finalMethod);
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);
    return omc;
    
    // Mutant code
    FinalClassMethodReference x = (FinalClassMethodReference) super.clone();
    x.o = o;
    x.l = o.orElseGet(x::overridableMethod);
    x.m = o.orElseGet(x::privateMethod);
    x.n = o.orElseGet(x::finalMethod);
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