class InstanceCheck {

    public boolean showBug() {
        String jlfdpqgi = "Hello, World!";
        return Integer.class.isInstance(jlfdpqgi); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}