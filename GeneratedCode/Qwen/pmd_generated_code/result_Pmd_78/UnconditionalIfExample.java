class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        return result;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }

    // Mutated code with renaming operator
    public String showBugMutant() {
        String x = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            x += " because the if statement is always true";
        }
        return x;
    }

    public static void mainMutant(String[] args) {
        UnconditionalIfExample y = new UnconditionalIfExample();
        System.out.println(y.showBugMutant());
    }
}