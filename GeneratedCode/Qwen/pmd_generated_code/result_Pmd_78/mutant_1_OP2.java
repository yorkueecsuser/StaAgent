class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        result = "This is a bug"; // Duplicate assignment
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
            result += " because the if statement is always true"; // Duplicate assignment
        }
        return result;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}