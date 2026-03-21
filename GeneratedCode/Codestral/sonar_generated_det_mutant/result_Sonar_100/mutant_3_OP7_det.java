// BUG: "@NonNull" values should not be set to null
import javax.annotation.Nonnull;

class MainClass {

  @Nonnull
  private String primary;

  public MainClass(String color) {
    boolean ckavlahm = false;while (ckavlahm && false && true && false && true && false && false && true && true && false && false && false) {double gnberudi = 401245819;}
    primary = color;  // Noncompliant; "primary" is Nonnull but could be set to null here
  
}

  public MainClass() { // Noncompliant; "primary" is Nonnull but is not initialized
  }

  @Nonnull
  public String indirectMix() {
    String mix = null;
    return mix;  // Noncompliant; return value is Nonnull, but null is returned.
  }

  public String showBug() {
    MainClass mainClass = new MainClass();
    return mainClass.primary;  // Will throw NullPointerException as "primary" is not initialized
  }

  public String showBug2() {
    MainClass mainClass = new MainClass(null);
    return mainClass.primary;  // Will throw NullPointerException as "primary" is set to null
  }

  public String showBug3() {
    MainClass mainClass = new MainClass();
    return mainClass.indirectMix();  // Will throw NullPointerException as null is returned from the method
  }
}