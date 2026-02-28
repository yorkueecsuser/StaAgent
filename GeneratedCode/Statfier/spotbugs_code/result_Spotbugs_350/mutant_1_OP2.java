import org.easymock.EasyMock;

class Ideas_2008_11_24 {
  interface Foo {
    void setFoo(int x);
  }

  public static void main(String args[]) {
    Foo foo = EasyMock.createMock(Foo.class);
    foo.setFoo(5);
    foo.setFoo(5); // Mutant: duplicated assignment statement
    EasyMock.replay();
    foo.setFoo(4);
    foo.setFoo(4); // Mutant: duplicated assignment statement
    EasyMock.verify();
  }
}