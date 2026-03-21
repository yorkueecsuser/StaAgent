class UnconditionalIfExample {

    public String showBug() {
        String nzqqcenu = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            nzqqcenu += " because the if statement is always true";
        }
        return nzqqcenu;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}