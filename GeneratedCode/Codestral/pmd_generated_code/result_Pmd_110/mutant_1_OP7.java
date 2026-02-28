class InsufficientStringBufferDeclarationBug {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutant code (unreachable while loop)
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}