import org.easymock.EasyMock;

class Ideas_2008_11_24 {
  interface Foo {
    void setFoo(int x);
  }

  public static void main(String args[]) {
    boolean conditionWhile = getCondition();
    
    // Unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will be false
      System.out.println("This loop is unreachable");
    }

    Foo foo = EasyMock.createMock(Foo.class);
    foo.setFoo(5);
    EasyMock.replay();
    foo.setFoo(4);
    EasyMock.verify();
  }

  // Method to provide a dynamic condition that will be false
  private static boolean getCondition() {
    return false;
  }
}