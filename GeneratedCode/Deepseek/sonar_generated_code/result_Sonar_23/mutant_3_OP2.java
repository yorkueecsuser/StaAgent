class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        Child childDuplicate = (Child) parent; // Mutant code: Duplicated variable declaration and initialization
        childDuplicate.sayHello();
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        Child childDuplicate = (Child) parent; // Mutant code: Duplicated variable declaration and initialization
        childDuplicate.sayHello();
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}