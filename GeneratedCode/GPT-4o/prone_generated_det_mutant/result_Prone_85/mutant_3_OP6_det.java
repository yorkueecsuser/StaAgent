class InstanceCheck {

    public boolean showBug() {
        for  (int lvnlurtf = 0; lvnlurtf < 0; lvnlurtf++) {char dqawkgcd = 'w';}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}