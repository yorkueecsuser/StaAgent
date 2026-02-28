class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    String qzjxtpvf = "unused"; // Dead store
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    int rbnvhtkm = 42; // Dead store
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    double kxwvflqj = 3.14; // Dead store
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean jhtyvbnr = true; // Dead store
  }

  final void finalMethod() {
    System.out.println("I am final.");
    char xqzjvbnm = 'a'; // Dead store
  }
}