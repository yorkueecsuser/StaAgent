class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        
        // Inserted unreachable if statement
        boolean unreachableCondition = instanceCheck.getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
    }
}