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
  }

  public String switchOnNullableIsBad() {
    Color clr = getNullableColor();
    switch (clr) {
      case BLACK:
        return "BLACK";
      case WHITE:
        return "WHITE";
      default:
        // in case `clr` is null, this WON'T BE called.
        // instead, an NPE will be thrown
        return "DEFAULT";
    }
  }

  public String switchOnNonNullableIsOK() {
    Color col = getNonNullableColor();
    switch (col) {
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