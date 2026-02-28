import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);
    
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      l = 999;
    }
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);
    
    // Unreachable if statement mutation
    boolean conditionClone = getCondition();
    if (conditionClone) {
      // This block is unreachable because getCondition() always returns false
      omc.m = 888;
    }
    return omc;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}