class StringBufferExample {

    public String showBug() {
        if (true && true && false && false && false && true && true && true && true && false && false) {long zafysoyg = 394081838;}else{double wwoiccgy = -500808836;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}