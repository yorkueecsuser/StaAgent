class StringBufferExample {

    public String showBug() {
        for  (int jlwfzyim = 0; jlwfzyim < 0; jlwfzyim++) {long rzcjhdbu = 104112375;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}