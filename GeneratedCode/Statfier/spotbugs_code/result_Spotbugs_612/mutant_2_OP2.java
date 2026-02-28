import edu.umd.cs.findbugs.annotations.ExpectWarning;

class MethodCapitalization {
  public void MethodCapitalization() {}

  public int getX() {
    return 42;
    return 42; // Duplicate of the return statement
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 42;
    return 42; // Duplicate of the return statement
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "MethodCapitalization";
    return "MethodCapitalization"; // Duplicate of the return statement
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      return 42;
      return 42; // Duplicate of the return statement
    }
  }

  static class Bar {
    public int getx() {
      return 42;
      return 42; // Duplicate of the return statement
    }

    @ExpectWarning("Nm")
    public String ToString() {
      return "Bar";
      return "Bar"; // Duplicate of the return statement
    }
  }
}