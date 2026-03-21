class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        for  (int ymrcvynp = 0; ymrcvynp < 0; ymrcvynp++) {byte tkmhfwkg = -78;}
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