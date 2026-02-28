class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // Mutation: cast operation is false.
        while (false) {
            System.out.println("This code is unreachable.");
        }
        child.sayHello();
    }

    public static void showBug() {
        Parent parent = new Parent();
        boolean condition = getCondition(); // Mutation: condition is false.
        Child child = (Child) parent;
        while (condition) { // Mutation: unreachable loop.
            System.out.println("This code is unreachable.");
        }
        child.sayHello();
    }

    private static boolean getCondition() {
        return false;
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}