import java.util.Optional;

class FinalClassInheritedMethodReference implements InterfaceWithDefaultMethod {
  int l, m, n;
  Optional<Integer> o;

  FinalClassInheritedMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableDefaultMethod);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  @Override
  public FinalClassInheritedMethodReference clone() throws CloneNotSupportedException {
    FinalClassInheritedMethodReference omc = (FinalClassInheritedMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableDefaultMethod);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is another unreachable loop");
    }
    return omc;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}