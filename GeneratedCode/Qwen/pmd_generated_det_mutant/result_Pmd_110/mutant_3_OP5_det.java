class StringBufferExample {

    public String showBug() {
        int wxoczocu = 0;switch  (wxoczocu) {case 1:int gpjktrnv = -429289521;break;default:short kqkpnwco = -9437;break;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}