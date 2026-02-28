import java.util.Optional;

class MethodReferenceIndirect2 {
  int l, m, n;
  Optional<Integer> o;

  final int indirectOverridable() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectOverridable");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in indirectOverridable");
    }
    return o.orElseGet(this::overridableMethod);
  }

  final int indirectPrivate() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectPrivate");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in indirectPrivate");
    }
    return o.orElseGet(this::privateMethod);
  }

  final int indirectFinal() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in indirectFinal");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in indirectFinal");
    }
    return o.orElseGet(this::finalMethod);
  }

  MethodReferenceIndirect2(Optional<Integer> opt) {
    o = opt;
    l = indirectOverridable();
    m = indirectPrivate();
    n = indirectFinal();
  }

  @Override
  public MethodReferenceIndirect2 clone() throws CloneNotSupportedException {
    MethodReferenceIndirect2 omc = (MethodReferenceIndirect2) super.clone();
    omc.o = o;
    omc.l = omc.indirectOverridable();
    omc.m = omc.indirectPrivate();
    omc.n = omc.indirectFinal();
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
    return false; // This method will always return false, ensuring the if-else branches are unreachable
  }
}