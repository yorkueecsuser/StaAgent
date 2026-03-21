class InstanceCheck {

    public boolean showBug() {
        int umuwgmzg = 0;switch  (umuwgmzg) {case 1:double ibygzbjd = -940260378;break;default:double hgygaaow = -997806607;break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}