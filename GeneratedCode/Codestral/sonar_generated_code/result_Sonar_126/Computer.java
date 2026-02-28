// Parent class
class Computer {
    static class Pear {}
}

class Parent {
    public void doSomething(Computer.Pear p) {
        System.out.println("Parent's doSomething");
    }

    public static void doSomethingElse() {
        System.out.println("Parent's doSomethingElse");
    }

    public void showBug() {
        this.doSomething(new Computer.Pear());
        Parent.doSomethingElse();

        Child child = new Child();
        child.doSomething(new Fruit.Pear()); // Bug: this is not an override
        child.doSomethingElse(); // Bug: parent method is static
    }
}

// Child class
class Fruit {
    static class Pear {}
}

class Child extends Parent {
    public void doSomething(Fruit.Pear p) {
        System.out.println("Child's doSomething"); // Bug: this is not an override of the parent method
    }

    public void doSomethingElse() { // Bug: this is not an override of the static parent method
        System.out.println("Child's doSomethingElse");
    }
}