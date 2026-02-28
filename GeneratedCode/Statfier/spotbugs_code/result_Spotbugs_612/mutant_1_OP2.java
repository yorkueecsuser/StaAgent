import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    int x = 42;
    int y = x; // Duplicate assignment
    return x;
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 42;
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      int x = 42;
      int y = x; // Duplicate assignment
      return x;
    }
  }

  static class Bar {
    public int getx() {
      int x = 42;
      int y = x; // Duplicate assignment
      return x;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      return "Bar";
    }
  }
}