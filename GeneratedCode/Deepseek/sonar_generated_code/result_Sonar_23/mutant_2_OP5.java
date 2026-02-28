class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        boolean condition = getCondition();
        if(condition) {
            switch("Unreachable switch statement") {
                case "Unreachable switch statement":
                    System.out.println("This switch statement is unreachable due to the added condition");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
    }

    public static void showBug() {
        Parent parent = new Parent();
        Child child = (Child) parent; // BUG: Cast operations should not trigger a ClassCastException
        child.sayHello();
        boolean condition = getCondition();
        if(condition) {
            switch("Unreachable switch statement") {
                case "Unreachable switch statement":
                    System.out.println("This switch statement is unreachable due to the added condition");
                    break;
                default:
                    System.out.println("Default case");
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

    private static boolean getCondition() {
        return false;
    }
}