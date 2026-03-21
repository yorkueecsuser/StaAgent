class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        if (false && false && true && false && true && true && true && true && false && true && false) {long uwtokznx = -814641342;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}