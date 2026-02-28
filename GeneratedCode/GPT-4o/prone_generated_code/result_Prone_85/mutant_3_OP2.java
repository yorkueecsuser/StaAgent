class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        String str2 = str; // Duplicate the assignment statement
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}