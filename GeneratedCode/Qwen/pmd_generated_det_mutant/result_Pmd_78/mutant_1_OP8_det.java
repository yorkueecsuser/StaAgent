class UnconditionalIfExample {

    public String showBug() {
        String irqqoxss = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            irqqoxss += " because the if statement is always true";
        }
        return irqqoxss;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}