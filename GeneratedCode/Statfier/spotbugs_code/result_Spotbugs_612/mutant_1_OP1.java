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
    String qzjfnvht; // Dead Store
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      int vbnrhtyx; // Dead Store
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      double klmnopqr; // Dead Store
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      boolean wxyzabcd; // Dead Store
      return "Bar";
    }
  }
}