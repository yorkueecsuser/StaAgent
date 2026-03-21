class InstanceCheck {

    public boolean showBug() {
        for  (int pjqxrhtv = 0; pjqxrhtv < 0; pjqxrhtv++) {short erhxmjez = -4589;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}