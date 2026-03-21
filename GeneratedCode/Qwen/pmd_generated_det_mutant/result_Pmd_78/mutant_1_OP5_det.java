class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        int bccgpfnf = 0;switch  (bccgpfnf) {case 1:double kqkdaulp = 957747252;break;default:char tirkmzqr = 'h';break;}
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