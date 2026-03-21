class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        int yqggglog = 0;switch  (yqggglog) {case 1:short gcrslhli = -4813;break;default:String whowudoc = "inunlidx";break;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    
}

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}