class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        boolean isInstance = Integer.class.isInstance(str); // Original assignment
        boolean duplicateIsInstance = Integer.class.isInstance(str); // Duplicate assignment

        return isInstance; // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}