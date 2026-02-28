class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public boolean showBugMutation1() {
        String a = "Hello, World!";
        return Integer.class.isInstance(a); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        System.out.println("Is 'a' an instance of Integer? " + instanceCheck.showBugMutation1());
    }
}