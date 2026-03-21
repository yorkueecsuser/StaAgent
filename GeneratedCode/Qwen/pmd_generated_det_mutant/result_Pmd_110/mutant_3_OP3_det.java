class StringBufferExample {

    public String showBug() {
        if (false && false && true && true && true && false && false && false && false && true && false) {long mrhlyyog = 105460962;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}