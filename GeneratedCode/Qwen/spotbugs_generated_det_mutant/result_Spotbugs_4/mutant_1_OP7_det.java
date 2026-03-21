class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        boolean zfrrolxt = false;while (zfrrolxt && false && true && false && false && true && false && false && false && false && true && false) {float gabqpbut = 959710900;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}