class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        int abcdefgh = 42; // Dead Store: Adding an unused integer variable
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}