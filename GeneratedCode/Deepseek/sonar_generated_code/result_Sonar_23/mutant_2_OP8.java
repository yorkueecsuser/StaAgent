class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
    }

    public static void showBug() {
        Parent p = new Parent();
        Child c = (Child) p; // BUG: Cast operations should not trigger a ClassCastException
        c.sayHello();
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}