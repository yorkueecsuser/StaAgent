class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }

        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result += " this part will never run";
        } else {
            result += " this part will also never run";
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}