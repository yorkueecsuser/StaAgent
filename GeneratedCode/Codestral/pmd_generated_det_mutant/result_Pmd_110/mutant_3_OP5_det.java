class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        int twqmkvdv = 0;switch  (twqmkvdv) {case 1:boolean phaisybj = true;break;default:byte eexsovxu = 31;break;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}