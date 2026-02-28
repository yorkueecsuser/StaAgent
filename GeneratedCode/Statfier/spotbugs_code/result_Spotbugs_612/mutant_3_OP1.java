import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    return 42;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    String qvbnrhty; // Dead store
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      int zxcvbnmr; // Dead store
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      double asdfghjk; // Dead store
      return "Bar";
    }
  }
}