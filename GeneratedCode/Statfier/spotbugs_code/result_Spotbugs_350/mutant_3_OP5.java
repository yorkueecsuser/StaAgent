import org.easymock.EasyMock;

class Ideas_2008_11_24 {
  interface Foo {
    void setFoo(int x);
  }

  public static void main(String args[]) {
    Foo foo = EasyMock.createMock(Foo.class);
    foo.setFoo(5);
    EasyMock.replay();
    foo.setFoo(4);
    EasyMock.verify();

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Ensuring the switch condition is always 0, making it unreachable
    }
  }
}