class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) { // This branch is unreachable because getCondition() will never return true
            result += " this part is unreachable";
        }
        
        return result;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}