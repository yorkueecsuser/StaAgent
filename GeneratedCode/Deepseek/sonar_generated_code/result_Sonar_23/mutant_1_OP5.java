class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Unreachable switch statement mutation
        boolean condition = true;
        if(condition) {
            int x = 10;
            switch (x) {
                case 10:
                    break;
            }
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();

        // Unreachable switch statement mutation
        boolean condition = true;
        if(condition) {
            int x = 10;
            switch (x) {
                case 10:
                    break;
            }
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