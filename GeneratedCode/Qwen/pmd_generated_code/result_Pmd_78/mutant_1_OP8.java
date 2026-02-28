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

    // Mutant code with renaming mutation operator
    public String showBugMutant() {
        String a = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            a += " because the if statement is always true";
        }
        return a;
    }

    public static void mainMutant(String[] args) {
        UnconditionalIfExample b = new UnconditionalIfExample();
        System.out.println(b.showBugMutant());
    }
}