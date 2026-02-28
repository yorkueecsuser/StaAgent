class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }

        // Mutant: Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result += " This part is reachable";
        } else {
            result += " This part is unreachable";
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the else block is effectively unreachable
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}