class StringBufferExample {

    public String showBug() {
        for  (int mnmohujd = 0; mnmohujd < 0; mnmohujd++) {long ncvegrup = 660853108;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}