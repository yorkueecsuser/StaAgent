class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // Assuming getUnreachableValue() never returns 999
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case to prevent compilation error
                break;
        }
    }

    // This method returns a value that makes the switch statement unreachable
    private static int getUnreachableValue() {
        return -1; // Arbitrary value that is not 999
    }
}