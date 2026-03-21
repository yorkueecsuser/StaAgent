class StringBufferExample {

    public String showBug() {
        int zurgkexx = 0;switch  (zurgkexx) {case 1:int jsnojftl = -963696946;break;default:float iwdajyzg = 144044666;break;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}