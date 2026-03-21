class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        int jaiirmld = 0;switch  (jaiirmld) {case 1:String qkxuzfmb = "rcmyivxt";break;default:double drxsmtjf = 63617764;break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}