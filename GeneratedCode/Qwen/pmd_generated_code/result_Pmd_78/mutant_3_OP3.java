class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        
        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) { // This branch is unreachable because getCondition() always returns false
            result += " this part is never reached";
        }
        
        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the if branch unreachable
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}