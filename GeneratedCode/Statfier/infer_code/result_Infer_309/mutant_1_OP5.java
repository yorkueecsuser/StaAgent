import javax.annotation.Nullable;

class SwitchCase {
  public String switchOnNullIsBad() {
    Color color = null;
    switch (color) {
      case BLACK:
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // the default case will never be called.
        // instead, an NPE will be thrown.
        return "DEFAULT";
    }

    // Unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? Color.BLACK : null) {
      case BLACK:
        return "UNREACHABLE_BLACK";
      case WHITE:
        return "UNREACHABLE_WHITE";
      default:
        return "UNREACHABLE_DEFAULT";
    }
  }

  public String switchOnNullableIsBad() {
    Color color = getNullableColor();
    switch (color) {
      case BLACK:
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // in case `color` is null, this WON'T BE called.
        // instead, an NPE will be thrown
        return "DEFAULT";
    }

    // Unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? Color.BLACK : null) {
      case BLACK:
        return "UNREACHABLE_BLACK";
      case WHITE:
        return "UNREACHABLE_WHITE";
      default:
        return "UNREACHABLE_DEFAULT";
    }
  }

  public String switchOnNonNullableIsOK() {
    Color color = getNonNullableColor();
    switch (color) {
      case BLACK:
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // default case won't happen, but this is fine
        return "DEFAULT";
    }

    // Unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? Color.BLACK : null) {
      case BLACK:
        return "UNREACHABLE_BLACK";
      case WHITE:
        return "UNREACHABLE_WHITE";
      default:
        return "UNREACHABLE_DEFAULT";
    }
  }

  private @Nullable Color getNullableColor() {
    return Color.BLACK;
  }

  private Color getNonNullableColor() {
    return Color.BLACK;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}

enum Color {
  BLACK,
  WHITE;
}