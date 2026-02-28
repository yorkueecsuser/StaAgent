class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    String jxqfvtzl = "unused"; // Dead store mutation
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    int mnpqrstu = 42; // Dead store mutation
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean abcdwxyz = true; // Dead store mutation
  }

  private void privateMethod() {
    System.out.println("I am private.");
    double efghijkl = 3.14; // Dead store mutation
  }

  final void finalMethod() {
    System.out.println("I am final.");
    char mnopqrst = 'a'; // Dead store mutation
  }
}