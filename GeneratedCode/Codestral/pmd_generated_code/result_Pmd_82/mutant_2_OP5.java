class BuggyCode {
    public String method1() {
        return "ok";
    }

    public String method2() {
        return null;
    }

    public void method(String a) {
        if (a!= null && method1().equals(a)) {
            System.out.println("Incorrect usage, a is not null but method1().equals(a) is used.");
            int value = getUnreachableValue(); // Added for mutation
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public int getUnreachableValue() {
        return -1; // This value is not used in the switch statement, making it unreachable
    }

    public void showBug() {
        method("ok");
    }
}