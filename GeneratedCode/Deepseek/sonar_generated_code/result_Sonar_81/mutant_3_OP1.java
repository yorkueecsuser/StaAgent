class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
  }

  private String generateRandomString() {
    String randomString = "";
    String characters = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < 8; i++) {
      int index = (int) (Math.random() * characters.length());
      randomString += characters.charAt(index);
    }
    return randomString;
  }
}