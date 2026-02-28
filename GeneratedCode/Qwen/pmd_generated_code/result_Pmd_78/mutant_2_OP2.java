class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        result = "This is a bug"; // Mutant: Duplicate assignment statement
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
            result += " because the if statement is always true"; // Mutant: Duplicate assignment statement within if block
        }
        return result;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}