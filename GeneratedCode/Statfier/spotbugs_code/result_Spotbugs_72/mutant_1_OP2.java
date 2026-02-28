import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);
    l = o.orElseGet(this::overridableDefaultMethod); // Mutant: duplicated assignment
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);
    omc.l = o.orElseGet(omc::overridableDefaultMethod); // Mutant: duplicated assignment
    return omc;
  }
}