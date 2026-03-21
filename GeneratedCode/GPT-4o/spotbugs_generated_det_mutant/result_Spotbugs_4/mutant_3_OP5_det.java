class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        int kvrjbvve = 0;switch  (kvrjbvve) {case 1:float fyydhkim = 364592319;break;default:char kjakisng = 'e';break;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    
}
}