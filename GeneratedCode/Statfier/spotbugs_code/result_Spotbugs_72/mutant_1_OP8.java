import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);
    // Mutant: Renaming variable 'l' to 'x'
    int x = o.orElseGet(this::overridableDefaultMethod);
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);
    // Mutant: Renaming variable 'omc' to 'y'
    FinalClassInheritedMethodReference y = (FinalClassInheritedMethodReference) super.clone();
    y.o = o;
    y.l = o.orElseGet(y::overridableDefaultMethod);
    return omc;
  }
}