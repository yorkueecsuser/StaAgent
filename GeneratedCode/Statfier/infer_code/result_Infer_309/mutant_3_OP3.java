import javax.annotation.Nullable;

class SwitchCase {
  public String switchOnNullIsBad() {
    Color color = null;
    switch (color) {
      case BLACK:
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
        }
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // the default case will never be called.
        // instead, an NPE will be thrown.
        return "DEFAULT";
    }
  }

  public String switchOnNullableIsBad() {
    Color color = getNullableColor();
    switch (color) {
      case BLACK:
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
        }
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // in case `color` is null, this WON'T BE called.
        // instead, an NPE will be thrown
        return "DEFAULT";
    }
  }

  public String switchOnNonNullableIsOK() {
    Color color = getNonNullableColor();
    switch (color) {
      case BLACK:
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
        }
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // default case won't happen, but this is fine
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
    return false; // This method will always return false, ensuring the if statement is unreachable
  }
}

enum Color {
  BLACK,
  WHITE;
}