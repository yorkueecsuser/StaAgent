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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is an unreachable case.");
        break;
      default:
        System.out.println("This is the default case.");
        break;
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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is an unreachable case.");
        break;
      default:
        System.out.println("This is the default case.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}