class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        int yigdqznk = 0;switch  (yigdqznk) {case 1:int tgbjrhaf = -330005444;break;default:double ngnlifvt = 556797683;break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}