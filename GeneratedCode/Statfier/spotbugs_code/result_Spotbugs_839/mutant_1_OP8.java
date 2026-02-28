import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_08_07 {

  final int x;

  Ideas_2011_08_07(int a) {
    this.x = a;
  }

  Ideas_2011_08_07 plusOne() {
    return new Ideas_2011_08_07(x + 1);
  }

  @Override
  public String toString() {
    return Integer.toString(x);
  }

  @DesireWarning("")
  public static void ignoredReturnValue() {
    Ideas_2011_08_07 b = new Ideas_2011_08_07(42);
    b.plusOne();
    System.out.println(b);
  }

  static class Bar {
    final int x;

    Bar() {
      x = 0;
    }

    Bar(int c) {
      this.x = c;
    }

    Bar plusOne() {
      return new Bar(x + 1);
    }

    Bar print() {
      System.out.println("x is " + x);
      return new Bar();
    }

    @ExpectWarning("")
    public static void ignoredReturnValueOK() {
      Bar d = new Bar(42);
      d.plusOne();
      System.out.println(d);
    }

    @NoWarning("")
    public static void ignoredReturnValue() {
      Bar e = new Bar(42);
      e.print();
      System.out.println(e);
    }
  }

  static class Foo<T> {

    final int x;

    Foo(int f) {
      this.x = f;
    }

    Foo<String> plusOne() {
      return new Foo<String>(x + 1);
    }

    Foo<T> plusTwo() {
      return new Foo<T>(x + 2);
    }

    // This causes new warning RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT
    // see feature#318
    // @NoWarning("")
    public static void ignoredReturnValueOK() {
      Foo g = new Foo(42);
      g.plusOne();
      System.out.println(g);
    }

    @DesireWarning("")
    public static void ignoredReturnValue() {
      Foo h = new Foo(42);
      h.plusTwo();
      System.out.println(h);
    }

    @Override
    public String toString() {
      return Integer.toString(x);
    }
  }
  //    @DesireWarning("")
  //    public static boolean test(@SlashedClassName String x, @DottedClassName String y) {
  //        return x.equals(y);
  //    }
}