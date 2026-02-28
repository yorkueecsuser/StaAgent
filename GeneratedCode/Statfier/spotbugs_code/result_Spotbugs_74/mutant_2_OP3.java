import java.util.Optional;

class MethodReference {
  int l, m, n;
  Optional<Integer> o;

  MethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 999;
    }
  }

  @Override
  public MethodReference clone() throws CloneNotSupportedException {
    MethodReference omc = (MethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      omc.m = 999;
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the condition is always false, making the if block unreachable
  }
}