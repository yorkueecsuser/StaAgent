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
    return "MethodCapitalization";
  }

  static class Foo extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int getx() {
      return 42;
    }
  }

  static class Bar {
    public int getx() {
      return 42;
    }

    @ExpectWarning("Nm")
    public String ToString() {
      return "Bar";
    }
  }

  // Mutated code starts here

  public int getY() {
    int a = 42; // Original variable name 'x' renamed to 'a'
    return a;
  }

  static class Baz extends MethodCapitalization {
    @ExpectWarning("Nm")
    public int gety() {
      int b = 42; // Original variable name 'x' renamed to 'b'
      return b;
    }
  }

  static class Quux {
    public int gety() {
      int c = 42; // Original variable name 'x' renamed to 'c'
      return c;
    }

    @ExpectWarning("Nm")
    public String toStringz() {
      String d = "Quux"; // Original variable name 'ToString' is not renamed
      return d;
    }
  }
}