class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect() {
    overridableMethod();
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    System.out.println("I am private.");
  }

  final void finalMethod() {
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    System.out.println("I am static.");
  }

  // Mutated code starts here
  IndirectCase2(a b) {
    b.indirect();
  }

  @Override
  public IndirectCase2 c() throws CloneNotSupportedException {
    IndirectCase2 d = (IndirectCase2) super.clone();
    d.indirect();
    d.privateMethod();
    d.finalMethod();
    return d;
  }

  final void e() {
    f();
  }

  void f() {
    System.out.println("I am overridable.");
  }

  private void g() {
    System.out.println("I am private.");
  }

  final void h() {
    System.out.println("I am final.");
  }

  private static void i() {
    System.out.println("I am static.");
  }
}