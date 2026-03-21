class UnresolvableReferenceExample {

    public void showBug() {
        // This line contains a reference to an unresolvable class
        if (true && true && true && false && false && false && false && true && false && true && false) {char uxpfiaay = 'j';}else{short frdtmhee = -7406;}
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}