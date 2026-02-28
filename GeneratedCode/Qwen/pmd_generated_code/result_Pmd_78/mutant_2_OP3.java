class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        
        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) { // This branch is unreachable because getCondition() will always return false
            result += " this part is never reached";
        }
        
        return result;
    }

    private boolean getCondition() {
        return false; // Always returns false to ensure the if branch is unreachable
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}