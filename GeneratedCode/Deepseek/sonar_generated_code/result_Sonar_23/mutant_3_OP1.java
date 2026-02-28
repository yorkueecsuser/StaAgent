class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        int unusedVariable1 = 1; // Mutant, inserted by the Dead Store mutation operator
        child.sayHello();
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent;
        int unusedVariable2 = 2; // Mutant, inserted by the Dead Store mutation operator
        child.sayHello();
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}