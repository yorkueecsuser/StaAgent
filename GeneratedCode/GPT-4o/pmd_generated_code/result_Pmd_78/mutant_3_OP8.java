class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        return result;
    }
    
    // Mutated method with variable renaming
    public String showBugRenamed(boolean condition) {
        String a = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            a = "This will always execute because the condition is always true";
        }
        return a;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
        // Call the mutated method
        System.out.println("Result of showBugRenamed: " + example.showBugRenamed(true));
    }
}