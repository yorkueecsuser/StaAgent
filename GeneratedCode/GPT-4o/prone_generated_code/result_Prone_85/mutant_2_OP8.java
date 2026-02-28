class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());

        // Mutant code
        String x = "Hello, World!";
        System.out.println("Is 'x' an instance of Integer? " + Integer.class.isInstance(x));
    }
}