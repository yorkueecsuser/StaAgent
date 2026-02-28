class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public boolean showBugMutant() {
        String a = "Hello, World!"; // Variable 'str' renamed to 'a'
        return Integer.class.isInstance(a);
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        System.out.println("Is 'a' an instance of Integer? " + instanceCheck.showBugMutant());
    }
}