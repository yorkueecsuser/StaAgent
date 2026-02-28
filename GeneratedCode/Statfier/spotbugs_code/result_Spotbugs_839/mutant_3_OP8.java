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
    Ideas_2011_08_07 x = new Ideas_2011_08_07(42);
    x.plusOne();
    System.out.println(x);
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
      System.out.println("b is " + b);
      return new Bar();
    }

    @ExpectWarning("")
    public static void ignoredReturnValueOK() {
      Bar x = new Bar(42);
      x.plusOne();
      System.out.println(x);
    }

    @NoWarning("")
    public static void ignoredReturnValue() {
      Bar x = new Bar(42);
      x.print();
      System.out.println(x);
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
      Foo x = new Foo(42);
      x.plusOne();
      System.out.println(x);
    }

    @DesireWarning("")
    public static void ignoredReturnValue() {
      Foo x = new Foo(42);
      x.plusTwo();
      System.out.println(x);
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