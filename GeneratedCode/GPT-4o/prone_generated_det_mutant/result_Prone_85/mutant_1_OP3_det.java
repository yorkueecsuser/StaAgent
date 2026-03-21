class InstanceCheck {

    public boolean showBug() {
        if (false && true && true && true && true && true && false && true && true && false && false) {boolean fovswqru = true;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}