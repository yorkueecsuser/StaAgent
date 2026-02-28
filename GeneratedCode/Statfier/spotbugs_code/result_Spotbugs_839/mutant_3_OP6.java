import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_08_07 {

  final int x;

  Ideas_2011_08_07(int x) {
    this.x = x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable
    }
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
    Ideas_2011_08_07 x = new Ideas_2011_08_07(42);
    x.plusOne();
    System.out.println(x);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable
    }
  }

  static class Bar {
    final int x;

    Bar() {
      x = 0;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
    }

    Bar(int x) {
      this.x = x;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
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
      Bar x = new Bar(42);
      x.plusOne();
      System.out.println(x);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
    }

    @NoWarning("")
    public static void ignoredReturnValue() {
      Bar x = new Bar(42);
      x.print();
      System.out.println(x);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
    }
  }

  static class Foo<T> {

    final int x;

    Foo(int x) {
      this.x = x;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
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
      Foo x = new Foo(42);
      x.plusOne();
      System.out.println(x);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
    }

    @DesireWarning("")
    public static void ignoredReturnValue() {
      Foo x = new Foo(42);
      x.plusTwo();
      System.out.println(x);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable
      }
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

  private static boolean getCondition() {
    return false;
  }
}