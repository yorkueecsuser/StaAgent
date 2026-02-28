class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }

        // Mutant: Inserting an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                result += " This case is unreachable";
                break;
            default:
                result += " Default case is also unreachable";
                break;
        }

        return result;
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}