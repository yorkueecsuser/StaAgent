import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_08_07 {

  final int x;

  Ideas_2011_08_07(int x) {
    this.x = x;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  static class Bar {
    final int x;

    Bar() {
      x = 0;
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    }

    Bar(int x) {
      this.x = x;
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    }

    @NoWarning("")
    public static void ignoredReturnValue() {
      Bar x = new Bar(42);
      x.print();
      System.out.println(x);
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  static class Foo<T> {

    final int x;

    Foo(int x) {
      this.x = x;
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
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
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    }

    @DesireWarning("")
    public static void ignoredReturnValue() {
      Foo x = new Foo(42);
      x.plusTwo();
      System.out.println(x);
      boolean condition = getCondition();
      switch (condition? 0 : 1) { // Unreachable switch statement
        case 0:
          System.out.println("This is unreachable");
          break;
      }
    }

    @Override
    public String toString() {
      return Integer.toString(x);
    }
  }

  private static boolean getCondition() {
    return false;
  }
}