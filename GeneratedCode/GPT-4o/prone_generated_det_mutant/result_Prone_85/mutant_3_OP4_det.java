class InstanceCheck {

    public boolean showBug() {
        if (true && false && false && false && false && true && true && false && false && true && false) {String patzgena = "isgtbdqc";}else{char tzojdeoh = 'z';}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}