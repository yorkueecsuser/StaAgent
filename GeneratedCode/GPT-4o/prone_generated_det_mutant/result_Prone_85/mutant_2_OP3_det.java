class InstanceCheck {

    public boolean showBug() {
        if (false && false && true && false && false && false && true && true && false && true && false) {char skzwftrf = 'c';}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}