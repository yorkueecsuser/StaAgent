class StringBufferExample {

    public String showBug() {
        if (true && true && false && true && false && false && true && false && false && true && false) {String blfjgsip = "ntwdhpeg";}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}