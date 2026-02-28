class InsufficientStringBufferDeclarationBug {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}