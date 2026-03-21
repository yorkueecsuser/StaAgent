class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        int wadbhmnz = 0;switch  (wadbhmnz) {case 1:char ujxfywia = 'a';break;default:double ujctoldu = -875962201;break;}
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