class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        switch("unreachable") {
            case "reachable": // This case is unreachable as the switch condition is "unreachable"
                break;
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        switch("unreachable") {
            case "reachable": // This case is unreachable as the switch condition is "unreachable"
                break;
        }
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}