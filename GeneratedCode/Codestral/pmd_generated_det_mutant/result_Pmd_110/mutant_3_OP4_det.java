class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        if (false && true && true && false && false && true && false && false && false && true && false) {float eexhlqjc = 667891849;}else{double awdxbcvy = -735457514;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}