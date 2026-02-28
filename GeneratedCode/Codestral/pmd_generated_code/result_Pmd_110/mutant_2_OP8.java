class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        StringBuilder x = bad; // Mutant code: Renaming the variable 'bad' to 'x'
        x.append("This is a long string that will exceed the default 16 characters");
        System.out.println(x.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}