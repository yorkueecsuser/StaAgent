import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      l = -1; // This line is unreachable
    }
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Introduced unreachable if statement
    boolean conditionClone = getCondition();
    if (conditionClone) {
      omc.m = -2; // This line is unreachable
    }
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

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}