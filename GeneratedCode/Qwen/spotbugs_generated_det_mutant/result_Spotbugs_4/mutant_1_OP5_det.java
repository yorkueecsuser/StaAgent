class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        int cpkhdpkn = 0;switch  (cpkhdpkn) {case 1:byte hdxfuvlz = -7;break;default:long tuahfabq = 730289638;break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}