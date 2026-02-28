class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
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

  // Mutated code
  final void b() {
    a();
    c();
  }

  final void a() {
    d();
    b();
    e();
  }

  void c() {
    System.out.println("I am overridable.");
  }

  private void e() {
    System.out.println("I am private.");
  }

  final void d() {
    System.out.println("I am final.");
  }

  private static void f() {
    System.out.println("I am static.");
  }
}