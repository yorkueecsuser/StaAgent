class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        if (true && true && true && true && true && true && true && true && false && false && false) {boolean uyygdnkn = true;}else{byte wmsbfnrw = 124;}
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