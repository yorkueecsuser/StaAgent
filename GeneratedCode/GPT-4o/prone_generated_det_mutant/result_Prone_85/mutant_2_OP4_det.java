class InstanceCheck {

    public boolean showBug() {
        if (true && true && false && true && false && false && true && false && false && false && false) {byte hofduahz = 19;}else{double drznwgig = 761436956;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}