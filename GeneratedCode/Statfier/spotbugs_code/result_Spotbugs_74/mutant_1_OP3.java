import java.util.Optional;

class MethodReference {
  int l, m, n;
  Optional<Integer> o;

  MethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      l = -1; // This line is unreachable
    }
  }

  @Override
  public MethodReference clone() throws CloneNotSupportedException {
    MethodReference omc = (MethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
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

  // Method to provide a dynamic condition for the unreachable if statement
  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}