class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        for  (int rirphinm = 0; rirphinm < 0; rirphinm++) {char myfesgoe = 'c';}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}