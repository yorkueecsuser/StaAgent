class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        float zefykixe = -608538505;
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