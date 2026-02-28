class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        if(shouldExecute()) {
            Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
            child.sayHello();
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        if(shouldExecute()) {
            Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
            child.sayHello();
        }
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
    
    private static boolean shouldExecute() {
        return false;
    }
}