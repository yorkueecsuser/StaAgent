import java.util.Optional;

class MethodReferenceIndirect3 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectOverridable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in indirectOverridable");
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectPrivate");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in indirectPrivate");
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectFinal");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in indirectFinal");
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
    omc.l = o.orElseGet(omc::indirectOverridable);
    omc.m = o.orElseGet(omc::indirectPrivate);
    omc.n = o.orElseGet(omc::indirectFinal);

    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in clone");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in clone");
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
    // This method ensures the condition is not a compile-time constant
    return false;
  }
}