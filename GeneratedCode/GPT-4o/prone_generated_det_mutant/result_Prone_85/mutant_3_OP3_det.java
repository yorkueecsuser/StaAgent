class InstanceCheck {

    public boolean showBug() {
        if (false && false && false && true && false && true && true && false && true && true && false) {double ipmqosae = 825220431;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}