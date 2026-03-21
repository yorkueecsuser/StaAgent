class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        boolean ofbgpukp = false;while (ofbgpukp && false && false && true && false && true && true && false && true && true && true && false) {short msdguvsx = 1039;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}