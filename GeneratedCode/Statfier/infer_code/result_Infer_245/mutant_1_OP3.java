import android.content.ClipboardManager;

class ClassLoading {
  ClipboardManager clipboard;

  public String getUserControlledString() {
    return this.clipboard.getText().toString();
  }

  public void clipboardToClassForNameBad() {
    try {
      Class cls = Class.forName(this.getUserControlledString());
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }

    // Mutant code with an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
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
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }

    // Mutant code with an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement.");
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}