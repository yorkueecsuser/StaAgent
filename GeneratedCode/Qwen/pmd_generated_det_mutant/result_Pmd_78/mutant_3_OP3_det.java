class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true && true && false && false && false && true && false && true && true && false && false) {char sgqrwtvr = 'l';}
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