class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        StringBuilder badDuplicate = new StringBuilder(); // Mutant: Duplication
        bad.append("This is a long string that will exceed the default 16 characters");
        badDuplicate.append("This is a long string that will exceed the default 16 characters"); // Mutant: Duplication
        System.out.println(bad.toString());
        System.out.println(badDuplicate.toString()); // Mutant: Duplication
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}