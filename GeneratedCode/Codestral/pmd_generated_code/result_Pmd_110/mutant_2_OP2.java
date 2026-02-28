class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        StringBuilder badDuplicate = new StringBuilder(); // Mutation: Duplicating the assignment statement
        bad.append("This is a long string that will exceed the default 16 characters");
        badDuplicate.append("This is a long string that will exceed the default 16 characters"); // Duplicated assignment
        System.out.println(bad.toString());
        System.out.println(badDuplicate.toString()); // Output the duplicated StringBuffer
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}