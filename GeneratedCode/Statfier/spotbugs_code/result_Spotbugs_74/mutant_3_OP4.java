import java.util.Optional;

class MethodReference {
  int l, m, n;
  Optional<Integer> o;

  MethodReference(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::overridableMethod);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      l = 99;
    } else {
      // This block will also never execute because the if condition is false
      l = 100;
    }
  }

  @Override
  public MethodReference clone() throws CloneNotSupportedException {
    MethodReference omc = (MethodReference) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::overridableMethod);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Inserting unreachable if-else statement
    boolean shouldRunClone = getCondition();
    if (shouldRunClone) {
      // This block will never execute because getCondition() returns false
      omc.m = 99;
    } else {
      // This block will also never execute because the if condition is false
      omc.m = 100;
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