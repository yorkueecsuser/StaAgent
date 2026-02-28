class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(50); // Mutated: Increased initial capacity to 50
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}