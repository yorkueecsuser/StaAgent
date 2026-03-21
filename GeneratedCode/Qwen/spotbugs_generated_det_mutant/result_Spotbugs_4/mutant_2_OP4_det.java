class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        if (true && false && false && false && false && false && false && false && false && false && false) {double gkkttxgn = 387084521;}else{boolean qjdfqneo = true;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}