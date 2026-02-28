class Parent {

    synchronized void foo() {
        System.out.println("Parent's foo method");
    }
}

class Child extends Parent {

    @Override
    public void foo () {  // Noncompliant, overridden method is not synchronized
        System.out.println("Child's foo method");
        super.foo();
    }

    public void showBug() {
        this.foo();
    }
}