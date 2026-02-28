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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() returns false
        l = 999;
        break;
      case false:
        // This case will also never be executed because getCondition() returns false
        m = 888;
        break;
    }
  }

  @Override
  public MethodReferenceIndirect1 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect1 omc = (MethodReferenceIndirect1) super.clone();
    omc.o = o;
    omc.l = o.orElseGet(omc::indirect);
    omc.m = o.orElseGet(omc::privateMethod);
    omc.n = o.orElseGet(omc::finalMethod);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() returns false
        omc.l = 777;
        break;
      case false:
        // This case will also never be executed because getCondition() returns false
        omc.m = 666;
        break;
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

  private boolean getCondition() {
    return false;
  }
}