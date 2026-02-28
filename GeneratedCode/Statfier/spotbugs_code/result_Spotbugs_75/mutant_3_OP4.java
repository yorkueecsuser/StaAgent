import java.util.Optional;

class MethodReferenceIndirect1 {
  int l, m, n;
  Optional<Integer> o;

  final int indirect() {
    return overridableMethod();
  }

  MethodReferenceIndirect1(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirect);
    m = o.orElseGet(this::privateMethod);
    n = o.orElseGet(this::finalMethod);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      l += 1;
    } else {
      // This block is unreachable
      l -= 1;
    }
  }

  @Override
  public MethodReferenceIndirect1 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omc = (MethodReferenceIndirect1) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirect);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      omc.m += 2;
    } else {
      // This block is unreachable
      omc.m -= 2;
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
    return true; // Always returns true to ensure the if block is reachable
  }
}