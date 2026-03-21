class InstanceCheck {

    public boolean showBug() {
        int bdausfqz = 0;switch  (bdausfqz) {case 1:String jlrycwls = "ptjcaaon";break;default:byte ucqkumfz = 6;break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}