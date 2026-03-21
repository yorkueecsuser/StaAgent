class InstanceCheck {

    public boolean showBug() {
        boolean ecjbsixe = false;while (ecjbsixe && true && false && true && true && false && true && false && false && false && true && false) {double fqvgbekv = -895538414;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}