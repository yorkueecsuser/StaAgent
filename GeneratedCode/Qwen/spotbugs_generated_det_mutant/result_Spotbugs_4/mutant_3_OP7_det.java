class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        boolean hnwtgphc = false;while (hnwtgphc && true && false && true && true && true && true && true && false && true && true && false) {long xkeazkjn = -373273508;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}