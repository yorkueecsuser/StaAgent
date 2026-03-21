class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        boolean zadipbrk = false;while (zadipbrk && true && true && true && false && true && true && true && true && true && false && false) {byte bgceweng = 111;}
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