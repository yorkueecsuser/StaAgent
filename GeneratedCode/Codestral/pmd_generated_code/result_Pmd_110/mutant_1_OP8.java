class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // Original code
        StringBuilder a = new StringBuilder(); // Mutated code: Renaming 'bad' to 'a'
        a.append("This is a long string that will exceed the default 16 characters");
        System.out.println(a.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}