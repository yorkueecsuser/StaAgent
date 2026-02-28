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
        }

        // Mutated code starts here
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // This case is unreachable as the value is always not equal to 1
                System.out.println("Unreachable code");
                break;
        }
        // Mutated code ends here
    }

    public void showBug() {
        method("ok");
    }

    private int getUnreachableValue() {
        // This method ensures that the switch condition always evaluates to a value that is not 1
        return 2;
    }
}