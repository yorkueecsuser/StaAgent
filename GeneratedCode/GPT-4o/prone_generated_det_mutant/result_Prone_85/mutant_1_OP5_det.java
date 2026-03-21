class InstanceCheck {

    public boolean showBug() {
        int vnnybdwd = 0;switch  (vnnybdwd) {case 1:char mcihyjfs = 'o';break;default:String pkfegxxm = "thysayrz";break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}