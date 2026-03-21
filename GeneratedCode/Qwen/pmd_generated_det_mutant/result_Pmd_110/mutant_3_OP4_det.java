class StringBufferExample {

    public String showBug() {
        if (false && false && false && true && true && false && true && true && false && false && false) {long bprlaqds = -741235015;}else{double iveqdbhi = -380065738;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}