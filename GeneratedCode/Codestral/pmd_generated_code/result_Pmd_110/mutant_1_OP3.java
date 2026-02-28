class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Added mutant code
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This line should never be executed");
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}