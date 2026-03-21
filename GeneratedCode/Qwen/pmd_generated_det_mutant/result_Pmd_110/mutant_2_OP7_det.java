class StringBufferExample {

    public String showBug() {
        boolean gbfjvzdg = false;while (gbfjvzdg && false && false && true && true && true && true && false && true && false && true && false) {byte qekpefqm = 24;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}