class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    // Method to provide a false switch condition
    private int getSwitchValue() {
        return 0; // This value will not match any case in the switch statement
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());

        // Unreachable switch statement
        int unreachableValue = instanceCheck.getSwitchValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                // default case that does nothing
                break;
        }
    }
}