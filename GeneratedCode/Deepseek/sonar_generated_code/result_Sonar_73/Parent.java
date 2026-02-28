class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // Noncompliant
    //...
    super.foo();
  }
}