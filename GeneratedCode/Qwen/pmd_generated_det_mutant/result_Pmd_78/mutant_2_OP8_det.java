class UnconditionalIfExample {

    public String showBug() {
        String ovwovqxm = "This is a bug";
        if (true) { // BUG: UnconditionalIfStatement
            ovwovqxm += " because the if statement is always true";
        }
        return ovwovqxm;
    }

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}