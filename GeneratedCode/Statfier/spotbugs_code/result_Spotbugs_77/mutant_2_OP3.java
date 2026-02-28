import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return o.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect3(Optional<Integer> opt) {
    o = opt;
    l = o.orElseGet(this::indirectOverridable);
    m = o.orElseGet(this::indirectPrivate);
    n = o.orElseGet(this::indirectFinal);
  }

  @Override
  public MethodReferenceIndirect3 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect3 omc = (MethodReferenceIndirect3) super.clone();
    omc.o = o;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    omc.l = o.orElseGet(omc::indirectOverridable);
    omc.m = o.orElseGet(omc::indirectPrivate);
    omc.n = o.orElseGet(omc::indirectFinal);
    return omc;
  }

  int overridableMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return 1;
  }

  private int privateMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return 2;
  }

  final int finalMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      int unreachableVar = 42;
      System.out.println("This is unreachable: " + unreachableVar);
    }
    return 3;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}