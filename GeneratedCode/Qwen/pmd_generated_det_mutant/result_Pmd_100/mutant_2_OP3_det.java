class AppendCharacterWithCharBug {

    public String showBug() {
        StringBuffer sb = new StringBuffer();
        if (false && true && true && true && true && false && false && true && false && false && false) {byte lttfledg = -99;}
        sb.append("a"); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        AppendCharacterWithCharBug example = new AppendCharacterWithCharBug();
        System.out.println(example.showBug());
    }
}