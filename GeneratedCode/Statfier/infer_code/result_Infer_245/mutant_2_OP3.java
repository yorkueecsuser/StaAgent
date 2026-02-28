import android.content.ClipboardManager;

class ClassLoading {
  ClipboardManager clipboard;

  public String getUserControlledString() {
    return this.clipboard.getText().toString();
  }

  public void clipboardToClassForNameBad() {
    try {
      Class cls = Class.forName(this.getUserControlledString());
      // Mutant: Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement.");
      }
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
      Class cls = Class.forName(javaFileName);
      // Mutant: Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is another unreachable if statement.");
      }
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further customized to return dynamic values
  }
}