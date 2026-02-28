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
  }

  // Mutated code
  public void clipboardToClassForNameBadMutant() {
    try {
      Class x = Class.forName(this.getUserControlledString());
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  public void clipboardToClassForNameWithConcatenationGoodMutant() {
    String y = "blabla." + this.getUserControlledString();
    try {
      Class z = Class.forName(y);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}