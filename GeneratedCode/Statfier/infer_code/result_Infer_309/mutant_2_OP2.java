import javax.annotation.Nullable;

class SwitchCase {
  public String switchOnNullIsBad() {
    Color color = null;
    color = null; // Mutant: Duplicate assignment statement
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
  }

  public String switchOnNonNullableIsOK() {
    Color color = getNonNullableColor();
    color = getNonNullableColor(); // Mutant: Duplicate assignment statement, but it uses method invocation, so we skip this
    switch (color) {
      case BLACK:
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
}

enum Color {
  BLACK,
  WHITE;
}