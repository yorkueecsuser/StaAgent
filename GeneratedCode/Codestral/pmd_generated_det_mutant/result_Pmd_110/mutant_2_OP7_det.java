class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        boolean mdcmxjcs = false;while (mdcmxjcs && true && true && false && false && false && false && false && true && true && true && false) {long shugqrqt = 119853386;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}