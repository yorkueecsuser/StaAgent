class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        // Unreachable if-else statement inserted
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never executed");
        } else {
            System.out.println("This is the only reachable branch of the unreachable if-else");
        }
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    private boolean getFalseCondition() {
        // A method to simulate a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}