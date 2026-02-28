class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        // Unreachable if statement mutant insertion
        boolean neverTrue = getFalseCondition();
        if (neverTrue) {
            System.out.println("This will never be executed.");
        }
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}