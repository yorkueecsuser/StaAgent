class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        boolean wanfyywb = false;while (wanfyywb && true && true && true && false && true && true && false && true && false && true && false) {float pmbxfmmg = 327504950;}
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