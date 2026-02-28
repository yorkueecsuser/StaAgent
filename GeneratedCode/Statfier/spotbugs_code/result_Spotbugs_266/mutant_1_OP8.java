class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect2() {
    indirect1();
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

  // Mutants
  final void x() { // Renamed from indirect1
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase3(a) { // Renamed constructor parameter
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase3(b) { // Renamed constructor parameter
    b.x(); // Renamed method call
  }

  @Override
  public DoubleIndirectCase3 y() throws CloneNotSupportedException { // Renamed method
    DoubleIndirectCase3 c = (DoubleIndirectCase3) super.clone();
    c.indirect1();
    c.privateMethod();
    c.finalMethod();
    return c;
  }

  final void z() { // Renamed from indirect2
    x(); // Renamed method call
    overridableMethod();
  }

  void d() { // Renamed from overridableMethod
    System.out.println("I am overridable.");
  }

  private void e() { // Renamed from privateMethod
    System.out.println("I am private.");
  }

  final void f() { // Renamed from finalMethod
    System.out.println("I am final.");
  }

  private static void g() { // Renamed from staticMethod
    System.out.println("I am static.");
  }
}