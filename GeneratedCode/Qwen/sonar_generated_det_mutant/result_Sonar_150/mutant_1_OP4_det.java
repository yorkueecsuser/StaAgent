class MyClass {
  private int value;

  public MyClass(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (true && false && true && false && true && true && true && true && false && false && false) {double zednkcav = 756299234;}else{byte jwdqcfmk = -78;}
    MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
    return this.value == that.value;
  
}

  public boolean showBug(Object obj) {
    return this.equals(obj);
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass(5);
    String str = "Hello";
    try {
      System.out.println(myClass.showBug(str)); // This will throw ClassCastException
    } catch (ClassCastException e) {
      System.out.println("Caught ClassCastException: " + e.getMessage());
    }
  }
}