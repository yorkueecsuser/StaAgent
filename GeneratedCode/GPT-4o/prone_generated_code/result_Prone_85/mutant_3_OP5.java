class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    private int getConditionValue() {
        return -1; // Always returns a value that does not match any case
    }

    public void demonstrateUnreachableSwitch() {
        int condition = getConditionValue();
        switch (condition) {
            case 0:
                System.out.println("This case is never reached.");
                break;
            case 1:
                System.out.println("Nor is this one.");
                break;
            default:
                // Default block is not unreachable, but provides no output
                break;
        }
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        instanceCheck.demonstrateUnreachableSwitch();
    }
}