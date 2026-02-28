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

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      l = 100; // This will never execute because condition is always false
    } else {
      l = 200; // This will also never execute because condition is always false
    }
  }

  @Override
  public MethodReferenceIndirect1 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omc = (MethodReferenceIndirect1) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirect);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Introduced unreachable if-else statement
    boolean conditionClone = getCondition();
    if (conditionClone) {
      omc.l = 101; // This will never execute because conditionClone is always false
    } else {
      omc.l = 201; // This will also never execute because conditionClone is always false
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