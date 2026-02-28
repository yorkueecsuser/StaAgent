import android.content.ClipboardManager;

class ClassLoading {
  ClipboardManager clipboard;

  public String getUserControlledString() {
    return this.clipboard.getText().toString();
  }

  public void clipboardToClassForNameBad() {
    try {
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      
      Class cls = Class.forName(this.getUserControlledString());
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  /*
    We don't want to report it as we consider that string concatenation
    sanitizes the user-controlled string for class loading.
  */
  public void clipboardToClassForNameWithConcatenationGood() {
    String javaFileName = "blabla." + this.getUserControlledString();
    try {
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      
      Class cls = Class.forName(javaFileName);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined at runtime
  }
}