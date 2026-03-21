class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        boolean errnefmb = false;while (errnefmb && true && false && true && true && false && false && true && true && true && true && false) {long uyowhwwu = 617326437;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}