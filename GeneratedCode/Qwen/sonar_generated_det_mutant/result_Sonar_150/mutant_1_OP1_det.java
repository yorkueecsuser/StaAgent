class MyClass {
  private int value;

  public MyClass(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    String jvrbozlu = "soqbtows";
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