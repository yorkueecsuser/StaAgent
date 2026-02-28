class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
    privateMethod();
    finalMethod();
    staticMethod();
    String abcdefgh = "unused"; // Dead Store
  }

  DirectCase(DirectCase other) {
    other.overridableMethod();
    int hijklmno = 0; // Dead Store
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean pqrstuvw = true; // Dead Store
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    char xyzabcde = 'x'; // Dead Store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    double fghijklm = 3.14; // Dead Store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    long nopqrstu = 123456789L; // Dead Store
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    short vwxyzabc = 123; // Dead Store
  }
}