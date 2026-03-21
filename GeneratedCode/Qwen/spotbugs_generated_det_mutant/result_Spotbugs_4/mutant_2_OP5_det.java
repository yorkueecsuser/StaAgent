class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        int yzytptrb = 0;switch  (yzytptrb) {case 1:long sjclqlij = 68676974;break;default:String bgodtamx = "fgmceihl";break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}