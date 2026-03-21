class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        if (true && false && false && false && false && true && true && false && true && false && false) {float eucgouty = -273432820;}else{int ubbzovlq = 918060098;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}