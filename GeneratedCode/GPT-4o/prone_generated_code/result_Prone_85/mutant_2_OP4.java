class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        // Unreachable if-else statement
        boolean unreachableCondition = determineCondition(); // This method returns false, making the branch unreachable
        if (unreachableCondition) {
            System.out.println("This line is unreachable.");
        } else {
            System.out.println("This line is also unreachable.");
        }
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    private boolean determineCondition() {
        return false; // This will ensure the if-else branch is unreachable
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}