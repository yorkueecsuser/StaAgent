class StringBufferExample {

    public String showBug() {
        int obuiovtv = 0;switch  (obuiovtv) {case 1:long avjjqzcz = -39563069;break;default:boolean dwnmwnxd = false;break;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();
        System.out.println(example.showBug());
    }
}