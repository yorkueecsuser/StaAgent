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
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
          return "UNREACHABLE";
        }
        return "DEFAULT";
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
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
          return "UNREACHABLE";
        }
        return "DEFAULT";
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
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
          return "UNREACHABLE";
        }
        return "DEFAULT";
    }
  }

  private @Nullable Color getNullableColor() {
    return Color.BLACK;
  }

  private Color getNonNullableColor() {
    return Color.BLACK;
  }

  private boolean getCondition() {
    // This method ensures the condition is not a compile-time constant
    return false;
  }
}

enum Color {
  BLACK,
  WHITE;
}