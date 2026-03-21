class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        boolean tcbebpep = false;while (tcbebpep && true && true && false && true && false && false && true && true && true && true && false) {float sxtznhab = -506557175;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}