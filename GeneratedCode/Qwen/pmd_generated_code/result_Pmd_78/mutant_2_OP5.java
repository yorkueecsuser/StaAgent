class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch effectively unreachable
            case 0:
                result += " This part is unreachable";
                break;
            default:
                // Do nothing
                break;
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}