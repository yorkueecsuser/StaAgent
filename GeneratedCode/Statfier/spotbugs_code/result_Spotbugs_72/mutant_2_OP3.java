import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      l = 0;
    }
  }

  private boolean getCondition() {
    return false;
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      omc.m = 0;
    }
    return omc;
  }
}