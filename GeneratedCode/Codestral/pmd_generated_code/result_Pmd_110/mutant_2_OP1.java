class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        String deadStore = "useless"; // Mutant: Dead Store
        bad.append("This is a long string that will exceed the default 16 characters");
        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}