class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        
        // Introduce an unreachable while loop
        int unreachableCondition = 0; // Using a non-final variable for condition
        boolean conditionWhile = unreachableCondition > 0;
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }
    }
}