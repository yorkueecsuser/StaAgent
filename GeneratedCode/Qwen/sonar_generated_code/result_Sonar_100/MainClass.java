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
    MainClass obj = new MainClass(); // This will cause NullPointerException when primary is accessed
  }

  public String showBug2() {
    MainClass obj = new MainClass(null); // This will set primary to null, causing NullPointerException when accessed
    return obj.primary; // Accessing primary which is null
  }

  public String showBug3() {
    MainClass obj = new MainClass("blue");
    return obj.indirectMix(); // This will return null, causing NullPointerException when used
  }

  public void showBug() {
    try {
      showBug1();
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException in showBug1: " + e.getMessage());
    }
    try {
      System.out.println("Result of showBug2: " + showBug2());
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException in showBug2: " + e.getMessage());
    }
    try {
      System.out.println("Result of showBug3: " + showBug3());
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException in showBug3: " + e.getMessage());
    }
  }
}