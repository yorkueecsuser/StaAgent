class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        boolean irxjklsy = false;while (irxjklsy && true && false && false && true && false && true && false && false && false && false && false) {byte wbkeduay = 18;}
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        return result;
    
}

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}