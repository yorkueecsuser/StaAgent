class InstanceCheck {

    public boolean showBug() {
        if (true && true && true && false && true && true && false && false && true && false && false) {double yxorujvb = -640455699;}else{long pvqvtgip = 317343514;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}