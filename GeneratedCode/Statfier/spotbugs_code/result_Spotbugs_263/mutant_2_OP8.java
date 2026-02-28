class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject b = (DirectCaseObject) super.clone(); // Mutated variable name from 'omc' to 'b'
    b.overridableMethod();
    b.privateMethod();
    b.finalMethod();
    return b;
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
}