class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true && false && false && true && true && false && false && true && true && true && false) {byte peazvnnq = -82;}else{short cvkgiktp = 9861;}
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