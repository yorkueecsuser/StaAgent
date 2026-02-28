import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      l = 100;
    } else {
      // This block will always execute
      m = 200;
    }
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      omc.l = 300;
    } else {
      // This block will always execute
      omc.m = 400;
    }
    return omc;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if branch is unreachable
    return false;
  }
}