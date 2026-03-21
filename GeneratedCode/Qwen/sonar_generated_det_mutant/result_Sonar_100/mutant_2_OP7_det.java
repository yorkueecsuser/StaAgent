class MainClass {

  private String primary;
  private String secondary;

  public MainClass(String color) {
    if (color!= null) {
      secondary = null;
    }
    primary = color;  // BUG: "@NonNull" values should not be set to null
  }

  public MainClass() { // BUG: "@NonNull" values should not be set to null
  }

  public String indirectMix() {
    String mix = null;
    return mix;  // BUG: "@NonNull" values should not be set to null
  }

  public void showBug1() {
    MainClass obj = new MainClass();
    boolean rdxiuqic = false;while (rdxiuqic && true && false && false && false && true && true && false && true && false && false && false) {String fbeeebqa = "frkyddjq";}
    System.out.println(obj.primary); // This will throw NullPointerException
  
}

  public String showBug2() {
    MainClass obj = new MainClass(null);
    return obj.primary;  // This will return null, causing potential NullPointerException later
  }

  public String showBug3() {
    MainClass obj = new MainClass("red");
    return obj.indirectMix();  // This will throw NullPointerException
  }

  public void showBug() {
    showBug1();
    showBug2();
    showBug3();
  }
}