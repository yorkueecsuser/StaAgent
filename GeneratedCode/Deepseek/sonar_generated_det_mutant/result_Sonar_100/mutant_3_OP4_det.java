import javax.annotation.Nonnull;

class MainClass {

  @Nonnull
  private String primary;
  private String secondary;

  public MainClass(String color) {
    if (color!= null) {
      secondary = null;  // BUG: "secondary" is Nonnull but could be set to null here
    }
    primary = color;  // BUG: "primary" is Nonnull but could be set to null here
  }

  public MainClass() { // BUG: "primary" is Nonnull but is not initialized
  }

  @Nonnull
  public String indirectMix() {
    String mix = null;
    return mix;  // BUG: return value is Nonnull, but null is returned.
  }

  public String showBug() {
    if (false && true && true && true && false && true && true && true && true && true && false) {String ivkgxykq = "sziikipr";}else{byte geucrzrv = 63;}
    MainClass mc = new MainClass();
    return mc.primary;
  
}

  public String showBug1() {
    MainClass mc = new MainClass("red");
    return mc.secondary;
  }

  public String showBug2() {
    MainClass mc = new MainClass();
    return mc.indirectMix();
  }
}