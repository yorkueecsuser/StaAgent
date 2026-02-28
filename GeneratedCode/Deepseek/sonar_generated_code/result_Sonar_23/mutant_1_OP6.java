class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        child.sayHello();

        boolean condition = getCondition();
        for (; condition;) {
            System.out.println("This loop is unreachable");
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent;
        child.sayHello();

        boolean condition = getCondition();
        for (; condition;) {
            System.out.println("This loop is unreachable");
        }
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}