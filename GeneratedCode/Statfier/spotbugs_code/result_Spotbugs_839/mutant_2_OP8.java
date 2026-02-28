import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_08_07 {

  final int a;

  Ideas_2011_08_07(int a) {
    this.a = a;
  }

  Ideas_2011_08_07 plusOne() {
    return new Ideas_2011_08_07(a + 1);
  }

  @Override
  public String toString() {
    return Integer.toString(a);
  }

  @DesireWarning("")
  public static void ignoredReturnValue() {
    Ideas_2011_08_07 a = new Ideas_2011_08_07(42);
    a.plusOne();
    System.out.println(a);
  }

  static class Bar {
    final int b;

    Bar() {
      b = 0;
    }

    Bar(int b) {
      this.b = b;
    }

    Bar plusOne() {
      return new Bar(b + 1);
    }

    Bar print() {
      System.out.println("x is " + b);
      return new Bar();
    }

    @ExpectWarning("")
    public static void ignoredReturnValueOK() {
      Bar b = new Bar(42);
      b.plusOne();
      System.out.println(b);
    }

    @NoWarning("")
    public static void ignoredReturnValue() {
      Bar b = new Bar(42);
      b.print();
      System.out.println(b);
    }
  }

  static class Foo<T> {

    final int c;

    Foo(int c) {
      this.c = c;
    }

    Foo<String> plusOne() {
      return new Foo<String>(c + 1);
    }

    Foo<T> plusTwo() {
      return new Foo<T>(c + 2);
    }

    // This causes new warning RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT
    // see feature#318
    // @NoWarning("")
    public static void ignoredReturnValueOK() {
      Foo c = new Foo(42);
      c.plusOne();
      System.out.println(c);
    }

    @DesireWarning("")
    public static void ignoredReturnValue() {
      Foo c = new Foo(42);
      c.plusTwo();
      System.out.println(c);
    }

    @Override
    public String toString() {
      return Integer.toString(c);
    }
  }
  //    @DesireWarning("")
  //    public static boolean test(@SlashedClassName String x, @DottedClassName String y) {
  //        return x.equals(y);
  //    }
}