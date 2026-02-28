class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutant Code: Unreachable switch statement
        boolean neverExecuted = false;
        if (neverExecuted) {
            int value = 0; // This value is not used in any case labels
            switch (value) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
                default:
                    break;
            }
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}