import java.util.Objects;

class MainClass {
  private String primary;
  private String secondary;

  public MainClass(String color) {
    if (color!= null) {
      secondary = null; // BUG; Nonnull value "secondary" could be set to null
    }
    primary = Objects.requireNonNull(color, "primary is Nonnull but could be set to null here");
  }

  public MainClass() { // BUG; "primary" is Nonnull but is not initialized
    primary = "default";
  }

  public String indirectMix() {
    String mix = null;
    return mix;  // BUG; return value is Nonnull, but null is returned.
  }

  public void showBug() {
    MainClass mc = new MainClass();
    mc.indirectMix();
  }
}