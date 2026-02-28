import java.util.Optional;

class FinalClassMethodReference {
  int l, m, n;
  Optional<Integer> o;

  FinalClassMethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      l = l + 1; // This will never execute
    } else {
      l = l - 1; // This will never execute
    }
  }

  @Override
  public FinalClassMethodReference clone() throws CloneNotSupportedException {
    FinalClassMethodReference omc = (FinalClassMethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      omc.m = omc.m + 1; // This will never execute
    } else {
      omc.m = omc.m - 1; // This will never execute
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
    return false; // This method always returns false, making the if-else branches unreachable
  }
}